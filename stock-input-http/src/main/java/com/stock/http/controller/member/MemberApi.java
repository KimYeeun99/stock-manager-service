package com.stock.http.controller.member;

import com.stock.application.port.in.member.MemberUseCase;
import com.stock.application.port.in.member.reponse.LoginResponse;
import com.stock.application.port.in.member.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberApi {
    private final MemberUseCase memberUseCase;

    @PostMapping
    public ResponseEntity<LoginResponse> doLogin(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(memberUseCase.login(request.email()));
    }
}
