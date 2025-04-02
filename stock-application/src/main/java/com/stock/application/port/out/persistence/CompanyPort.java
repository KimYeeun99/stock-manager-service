package com.stock.application.port.out.persistence;

import com.stock.application.domain.company.Company;

public interface CompanyPort {
    Company findById(Long id);
}
