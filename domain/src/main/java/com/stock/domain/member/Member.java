package com.stock.domain.member;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Member {
    private String id;
    private String name;
    private String email;
}
