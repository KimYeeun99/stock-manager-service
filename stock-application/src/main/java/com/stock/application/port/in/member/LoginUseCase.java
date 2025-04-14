package com.stock.application.port.in.member;

import com.stock.application.port.in.member.request.LoginRequest;
import com.stock.common.jwt.TokenResponse;

public interface LoginUseCase {
    TokenResponse doLogin(LoginRequest request);
}
