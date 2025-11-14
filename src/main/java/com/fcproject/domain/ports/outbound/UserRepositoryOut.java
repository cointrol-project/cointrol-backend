package com.fcproject.domain.ports.outbound;

import com.fcproject.domain.models.users.UserDomain;

import java.util.UUID;

public interface UserRepositoryOut {
        UserDomain findByEmail(String email);

        void save(UserDomain user);

        UserDomain findById(UUID id);
}
