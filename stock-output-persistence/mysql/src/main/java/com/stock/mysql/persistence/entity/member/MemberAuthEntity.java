package com.stock.mysql.persistence.entity.member;

import com.stock.application.domain.company.Company;
import com.stock.application.domain.member.LoginAuth;
import com.stock.mysql.persistence.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "member_auth", schema = "stock-mysql")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberAuthEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false, updatable = false)
    private Long memberId;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    public LoginAuth toDomain() {
        return LoginAuth.builder()
                .email(email)
                .passwordHash(passwordHash)
                .build();
    }
}
