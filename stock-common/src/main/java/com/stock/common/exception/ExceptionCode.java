package com.stock.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {
    //4XX
    UNAUTHORIZED(401, "UNAUTHORIZED","유효하지 않은 토큰"),
    NOT_FOUND(404, "NOT_FOUND", "존재하지 않는 정보"),

    //5XX
    INTERNAL_SERVER_ERROR(500, "NOT_FOUND", "서버 내부 오류"),
    SERVICE_AVAILABLE(503, "NOT_FOUND", "서비스에 접근할 수 없음")
    ;

    private final int statusCode;
    private final String error;
    private final String message;
}
