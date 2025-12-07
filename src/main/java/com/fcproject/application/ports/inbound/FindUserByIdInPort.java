package com.fcproject.application.ports.inbound;

import com.fcproject.application.core.domain.users.UserDomain;

import java.util.UUID;

public interface FindUserByIdInPort {
    UserDomain execute(UUID email);
}
