package com.stock.application.port.in.member.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record LoginRequest(
        @Email
        @NotNull
        String email,
        String password
) {
}
