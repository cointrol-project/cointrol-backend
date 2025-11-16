package com.fcproject.domain.ports.inbound;

import com.fcproject.domain.models.users.UserDomain;

public interface SaveNewUserUsecase {
    public void execute(UserDomain user);
}
