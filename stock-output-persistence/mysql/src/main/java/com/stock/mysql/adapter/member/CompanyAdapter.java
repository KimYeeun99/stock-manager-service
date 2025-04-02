package com.stock.mysql.adapter.member;

import com.stock.application.domain.company.Company;
import com.stock.application.port.out.persistence.CompanyPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CompanyAdapter implements CompanyPort {
    @Override
    public Company findById(Long id) {
        return Company.builder()
                .id(3L)
                .name("테스트명")
                .build();
    }
}
