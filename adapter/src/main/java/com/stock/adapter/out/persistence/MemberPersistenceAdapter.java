package com.stock.adapter.out.persistence;

import com.stock.application.port.out.GetMemberPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberPersistenceAdapter implements GetMemberPort {
    //Repository Autowired

    @Override
    public String getAllMember() {
        return null;
    }
}
