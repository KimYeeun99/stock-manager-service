package com.stock.application.port.in.member;

import com.stock.application.port.in.member.reponse.LoginResponse;

public interface MemberUseCase {
    LoginResponse login(String email);
}
