package com.fcproject.application.core.usecases.auth;

import com.fcproject.application.ports.inbound.AuthUsecase;

public class AuthenticateUserUseCase implements AuthUsecase {

    private final AuthService authService;

    public AuthenticateUserUseCase(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public String login(String email, String password) {
        return authService.authenticate(email, password);
    }
}
