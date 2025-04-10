package com.stock.http.controller.member;

import com.stock.application.port.in.member.MemberUseCase;
import com.stock.application.port.in.member.reponse.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberApi {
    private final MemberUseCase memberUseCase;

    @GetMapping
    public ResponseEntity<LoginResponse> doLogin(@RequestParam String email) {
        return ResponseEntity.ok(memberUseCase.login(email));
    }
}
