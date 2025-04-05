package com.stock.http.controller.company;

import com.stock.application.port.in.company.CompanyUseCase;
import com.stock.application.port.in.company.response.CompanyResponse;
import com.stock.common.exception.CommonException;
import com.stock.common.exception.ExceptionCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/company")
public class CompanyApi {
    private final CompanyUseCase companyUseCase;

    @GetMapping
    public ResponseEntity<CompanyResponse> getCompanyInfo(@RequestParam Long id) {
        return ResponseEntity.ok(companyUseCase.getCompany(id));
    }
}
