package com.stock.application.port.in.company;

import com.stock.application.port.in.company.response.CompanyResponse;

public interface CompanyUseCase {
    CompanyResponse getCompany(Long id);
}
