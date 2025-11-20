package com.fcproject.application.ports.outbound;

public interface AuthOutputPort {
    AuthenticationTokenResponse authenticate(LoginRequest loginRequest) throws Exception;
}