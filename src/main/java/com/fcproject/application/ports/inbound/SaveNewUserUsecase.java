package com.fcproject.application.ports.inbound;

import com.fcproject.application.core.domain.users.UserDomain;

public interface SaveNewUserUsecase {
    public void execute(UserDomain user);
}
