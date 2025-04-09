package com.stock.mysql.adapter.member;

import com.stock.application.domain.member.LoginAuth;
import com.stock.application.port.out.persistence.MemberPort;
import com.stock.common.exception.CommonException;
import com.stock.common.exception.ExceptionCode;
import com.stock.mysql.persistence.repository.member.MemberAuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberAdapter implements MemberPort {
    private final MemberAuthRepository memberAuthRepository;

    @Override
    public LoginAuth findLoginAuthByEmail(String email) {
        return memberAuthRepository.findByEmail(email)
                .orElseThrow(() -> new CommonException(ExceptionCode.NOT_FOUND))
                .toDomain();
    }
}
