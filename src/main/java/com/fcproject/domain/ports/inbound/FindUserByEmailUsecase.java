package com.fcproject.domain.ports.inbound;

import com.fcproject.domain.models.users.UserDomain;

public interface FindUserByEmailUsecase {
    UserDomain execute(String email);
}
