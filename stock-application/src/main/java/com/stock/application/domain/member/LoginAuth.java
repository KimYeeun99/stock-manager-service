package com.stock.application.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
@Builder
@AllArgsConstructor
public class LoginAuth {
    private String email;
    private String passwordHash;

    public boolean matchPassword(String password) {
        return StringUtils.pathEquals(password, this.passwordHash);
    }
}
