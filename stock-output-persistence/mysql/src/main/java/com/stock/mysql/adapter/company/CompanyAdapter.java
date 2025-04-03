package com.stock.mysql.adapter.company;

import com.stock.application.domain.company.Company;
import com.stock.application.port.out.persistence.CompanyPort;
import com.stock.common.exception.CommonException;
import com.stock.common.exception.ExceptionCode;
import com.stock.mysql.persistence.repository.company.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CompanyAdapter implements CompanyPort {
    private final CompanyRepository companyRepository;
    @Override
    public Company findById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new CommonException(ExceptionCode.NOT_FOUND))
                .toDomain();
    }
}
