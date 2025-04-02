package com.stock.application.port.in.company.response;

import com.stock.application.domain.company.Company;
import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE)
public record CompanyResponse(
        Long id,
        String name
) {
    public static CompanyResponse of(Company company) {
        return CompanyResponse.builder()
                .id(company.getId())
                .name(company.getName())
                .build();
    }
}
