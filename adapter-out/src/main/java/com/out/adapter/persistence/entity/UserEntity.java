package com.out.adapter.persistence.entity;

import com.out.adapter.persistence.entity.common.BaseEntity;
import com.stock.domain.member.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Users")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동 증가되는 ID
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Enumerated(EnumType.STRING)  // Enum 타입을 String으로 저장
    @Column(name = "role", nullable = false, columnDefinition = "ENUM('ADMIN', 'USER') DEFAULT 'USER'")
    private Role role;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "phone_number", length = 11)
    private String phoneNumber;

    @Column(name = "birth")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)  // Enum 타입을 String으로 저장
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Enumerated(EnumType.STRING)  // Enum 타입을 String으로 저장
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('ACTIVE', 'INACTIVE', 'DELETED') DEFAULT 'active'")
    private Status status;

    // Enum 타입 정의
    public enum Role {
        ADMIN, USER
    }

    public enum Gender {
        M, F
    }

    public enum Status {
        ACTIVE, INACTIVE, DELETED
    }

    public User toDomain() {
        return User.builder()
                .username(this.username)
                .email(this.email)
                .build();
    }
}
/**
 * CREATE TABLE Users (
 *     user_id INT AUTO_INCREMENT PRIMARY KEY,
 *     username VARCHAR(50) NOT NULL UNIQUE,
 *     role ENUM('admin', 'user') DEFAULT 'user',
 *     email VARCHAR(50) NOT NULL,
 *     phone_number VARCHAR(11),
 *     date_of_birth DATE,
 *     gender ENUM('M', 'F'),
 *     address TEXT,
 *     status ENUM('active', 'inactive', 'deleted') DEFAULT 'active',
 *     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 *     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
 * );
 */