package com.fcproject.adapters.outbound.repositoriesImpl;

import com.fcproject.adapters.outbound.entities.users.UserMapper;
import com.fcproject.adapters.outbound.repositories.UserJPARepository;
import com.fcproject.domain.models.users.UserDomain;
import com.fcproject.domain.ports.outbound.UserRepositoryOut;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class UserRepositoryImpl implements UserRepositoryOut {

    private final UserJPARepository userRepository;

    private UserRepositoryImpl(UserJPARepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDomain findByEmail(String email) {

        log.info("Find user by email: {}", email);
        return UserMapper.toDomain(userRepository.findByEmail(email).orElse(null));
    }

    @Override
    public void save(UserDomain user) {
        log.info("Save user: {}", user);
        userRepository.save(UserMapper.toEntity(user));
    }

    @Override
    public UserDomain findById(UUID id) {

        log.info("Find user by ID: {}", id);
        return UserMapper.toDomain(userRepository.findById(id).orElse(null));
    }
}
