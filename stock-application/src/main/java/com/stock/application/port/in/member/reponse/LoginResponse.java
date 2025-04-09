package com.stock.application.port.in.member.reponse;

import com.stock.application.domain.company.Company;
import com.stock.application.domain.member.LoginAuth;
import com.stock.application.port.in.company.response.CompanyResponse;
import lombok.AccessLevel;
import lombok.Builder;

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
}
