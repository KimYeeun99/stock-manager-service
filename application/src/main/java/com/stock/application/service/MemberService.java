package com.stock.application.service;

import com.stock.application.port.in.GetMemberUseCase;
import com.stock.application.port.out.GetMemberPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements GetMemberUseCase {
    public final GetMemberPort getMemberPort;

    @Override
    public String getAllMember() {
        return getMemberPort.getAllMember();
    }
}
