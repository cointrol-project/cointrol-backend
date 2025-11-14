package com.fcproject.application.usecases.users;

import com.fcproject.domain.models.users.UserDomain;

public interface FindUserByEmailUsecase {
    UserDomain execute(String email);
}
