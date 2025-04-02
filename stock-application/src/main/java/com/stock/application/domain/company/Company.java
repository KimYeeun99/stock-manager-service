package com.stock.application.domain.company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Company {
    private Long id;
    private String name;
}
