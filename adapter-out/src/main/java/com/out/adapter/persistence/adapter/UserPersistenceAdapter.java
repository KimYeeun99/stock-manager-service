package com.out.adapter.persistence.adapter;

import com.out.adapter.persistence.entity.UserEntity;
import com.out.adapter.persistence.repository.UserRepository;
import com.stock.application.port.out.GetUserPort;
import com.stock.domain.member.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements GetUserPort {
    private final UserRepository userRepository;
    @Override
    public User findUser(int userId) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("해당 변수를 찾지 못하였습니다."));
        return user.toDomain();
    }
}
