package com.stock.application.port.in.member.reponse;

import com.stock.application.domain.member.LoginAuth;
import lombok.AccessLevel;
import lombok.Builder;
import org.springframework.util.StringUtils;

@Builder(access = AccessLevel.PRIVATE)
public record LoginResponse(
        String email,
        String passwordHash
) {
    public static LoginResponse of(LoginAuth loginAuth) {
        return LoginResponse.builder()
                .email(loginAuth.getEmail())
                .passwordHash(loginAuth.getPasswordHash())
                .build();
    }

    public boolean matchPassword(String password) {
        return StringUtils.pathEquals(password, this.passwordHash);
    }
}
