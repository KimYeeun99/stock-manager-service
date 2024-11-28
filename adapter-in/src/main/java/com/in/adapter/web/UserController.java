package com.in.adapter.web;

import com.stock.application.dto.UserDto;
import com.stock.application.port.in.GetUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final GetUserUseCase getUserUseCase;

    @GetMapping("")
    public UserDto findUser() {
        return getUserUseCase.findUser(1);
    }
}
