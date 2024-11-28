package com.stock.application.service;

import com.stock.application.dto.UserDto;
import com.stock.application.port.in.GetUserUseCase;
import com.stock.domain.member.User;
import com.stock.application.port.out.GetUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements GetUserUseCase {
    private final GetUserPort getUserPort;

    @Override
    public UserDto findUser(int userId) {
        User user = getUserPort.findUser(userId);

        return UserDto.of(user);
    }
}
