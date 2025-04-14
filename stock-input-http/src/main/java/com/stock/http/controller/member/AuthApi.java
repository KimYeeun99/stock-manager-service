package com.stock.http.controller.member;

import com.stock.application.port.in.member.LoginUseCase;
import com.stock.application.port.in.member.request.LoginRequest;
import com.stock.common.jwt.TokenResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthApi {
    private final LoginUseCase loginUseCase;

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> doLogin(@Valid @RequestBody LoginRequest request) {
        return ResponseEntity.ok(loginUseCase.doLogin(request));
    }
}
