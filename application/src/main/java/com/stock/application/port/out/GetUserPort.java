package com.stock.application.port.out;

import com.stock.domain.member.User;

public interface GetUserPort {
    User findUser(int userId);
}
