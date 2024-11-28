package com.stock.application.port.in;

import com.stock.application.dto.UserDto;

public interface GetUserUseCase {
    UserDto findUser(int userId);
}
