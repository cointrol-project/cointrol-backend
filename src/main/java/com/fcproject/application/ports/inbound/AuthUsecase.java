package com.fcproject.application.ports.inbound;

public interface AuthUsecase {
    String login(String email, String password);
}
