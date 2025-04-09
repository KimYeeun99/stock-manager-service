package com.stock.mysql.persistence.repository.member;

import com.stock.mysql.persistence.entity.member.MemberAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberAuthRepository extends JpaRepository<MemberAuthEntity, Long> {
    Optional<MemberAuthEntity> findByEmail(String email);
}
