package com.stock.application.service;

import com.stock.application.domain.member.LoginAuth;
import com.stock.application.port.in.member.LoginUseCase;
import com.stock.application.port.in.member.request.LoginRequest;
import com.stock.application.port.out.persistence.MemberPort;
import com.stock.common.exception.CommonException;
import com.stock.common.exception.ExceptionCode;
import com.stock.common.jwt.JwtTokenProvider;
import com.stock.common.jwt.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginUseCase {
    private final MemberPort memberPort;
    private final JwtTokenProvider jwtTokenProvider;

    /**
     * 로그인 요청
     * @param request 로그인 필요 정보
     * @return
     */
    @Override
    public TokenResponse doLogin(LoginRequest request) {
        LoginAuth auth = memberPort.findLoginAuthByEmail(request.email());
        if (!auth.matchPassword(request.password())) {
            throw new CommonException(ExceptionCode.UNAUTHORIZED);
        }

        return new TokenResponse(jwtTokenProvider.createAccessToken(auth.getEmail(), "USER"));
    }
}