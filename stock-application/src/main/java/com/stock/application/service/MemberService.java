package com.stock.application.service;

import com.stock.application.domain.member.LoginAuth;
import com.stock.application.port.in.member.MemberUseCase;
import com.stock.application.port.in.member.reponse.LoginResponse;
import com.stock.application.port.out.persistence.MemberPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberUseCase {
    private final MemberPort memberPort;
    @Override
    public LoginResponse login(String email) {
        return LoginResponse.of(memberPort.findLoginAuthByEmail(email));
    }
}
