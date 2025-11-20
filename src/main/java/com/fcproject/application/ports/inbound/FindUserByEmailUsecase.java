package com.fcproject.application.ports.inbound;

import com.fcproject.application.core.domain.users.UserDomain;

public interface FindUserByEmailUsecase {
    UserDomain execute(String email);
}
