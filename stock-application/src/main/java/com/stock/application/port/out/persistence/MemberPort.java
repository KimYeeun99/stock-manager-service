package com.stock.application.port.out.persistence;

import com.stock.application.domain.member.LoginAuth;

public interface MemberPort {
    LoginAuth findLoginAuthByEmail(String email);
}
