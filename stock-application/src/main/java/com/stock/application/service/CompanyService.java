package com.stock.application.service;

import com.stock.application.domain.company.Company;
import com.stock.application.port.in.company.CompanyUseCase;
import com.stock.application.port.in.company.response.CompanyResponse;
import com.stock.application.port.out.persistence.CompanyPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService implements CompanyUseCase {
    private final CompanyPort companyPort;
    @Override
    public CompanyResponse getCompany() {
        return CompanyResponse.of(companyPort.findById(3L));
    }
}
