package com.fcproject.application.usecases.users;

import com.fcproject.domain.models.users.UserDomain;

import java.util.UUID;

public interface FindUserByIdUsecase {
    UserDomain execute(UUID email);
}
