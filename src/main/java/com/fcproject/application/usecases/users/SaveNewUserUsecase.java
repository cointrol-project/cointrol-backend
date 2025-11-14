package com.fcproject.application.usecases.users;

import com.fcproject.domain.models.users.UserDomain;

public interface SaveNewUserUsecase {
    public void execute(UserDomain user);
}
