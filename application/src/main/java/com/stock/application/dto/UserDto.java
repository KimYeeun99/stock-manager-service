package com.stock.application.dto;

import com.stock.domain.member.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String username;
    private String email;

    public static UserDto of(User user) {
        return UserDto.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
