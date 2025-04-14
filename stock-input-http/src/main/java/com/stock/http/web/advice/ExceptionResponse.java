package com.stock.http.web.advice;

import com.stock.common.exception.CommonException;
import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE)
public record ExceptionResponse(
        int status,
        String error,
        String message
) {
    public static ExceptionResponse of(int status, String error, String message) {
        return ExceptionResponse.builder()
                .status(status)
                .error(error)
                .message(message)
                .build();

    }

    public static ExceptionResponse of(CommonException exception) {
        return ExceptionResponse.builder()
                .status(exception.statusCode)
                .error(exception.error)
                .message(exception.message)
                .build();

    }
    /*public static ExceptionResponse of(String message) {
        return ExceptionResponse.builder()
                .success(false)
                .message(message)
                .build();
    }*/
}
