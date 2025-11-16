package com.fcproject.domain.ports.inbound;

import com.fcproject.domain.models.users.UserDomain;

import java.util.UUID;

public interface FindUserByIdUsecase {
    UserDomain execute(UUID email);
}
