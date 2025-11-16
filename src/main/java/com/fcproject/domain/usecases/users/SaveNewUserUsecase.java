package com.fcproject.domain.usecases.users;

import com.fcproject.domain.models.users.UserDomain;
import com.fcproject.domain.ports.outbound.UserRepositoryOut;
import com.fcproject.infrastructure.exceptions.NotAllFieldsFilledException;
import com.fcproject.infrastructure.exceptions.UserAlreadyExistsException;

public class SaveNewUserUsecase implements com.fcproject.domain.ports.inbound.SaveNewUserUsecase {

    private final UserRepositoryOut repositoryOut;

    public SaveNewUserUsecase(UserRepositoryOut repositoryOut) {
        this.repositoryOut = repositoryOut;
    }

    @Override
    public void execute(UserDomain user) {

        userValidation(user);

        repositoryOut.save(user);
    }

    public void userValidation(UserDomain user) {
        if (user.getEmail().isBlank() || user.getEmail().isEmpty()) {
            throw new NotAllFieldsFilledException("The email field must be filled");
        }
        if (user.getPassword().isBlank() || user.getPassword().isEmpty()) {
            throw new NotAllFieldsFilledException("The password field must be filled");
        }
        if (user.getFirstName().isBlank() || user.getFirstName().isEmpty()) {
            throw new NotAllFieldsFilledException("The first name field must be filled");
        }
        if (user.getLastName().isBlank() || user.getLastName().isEmpty()) {
            throw new NotAllFieldsFilledException("The last name field must be filled");
        }

        if (!user.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            throw new NotAllFieldsFilledException("The password must be at least 8 characters and contain at least one uppercase, one special character and one lowercase letter");
        }

        if (repositoryOut.findByEmail(user.getEmail()) != null) {
                throw new UserAlreadyExistsException("An user with this e-mail already exists");
        }

    }
}
