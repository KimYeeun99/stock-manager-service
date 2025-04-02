package com.stock.common.exception;

import jakarta.validation.constraints.NotNull;

public class CommonException extends RuntimeException {
    @NotNull
    public final int statusCode;
    @NotNull
    public final String defaultMessage;

    public final String detailMessage;

    public CommonException(int statusCode, String defaultMessage) {
        this.statusCode = statusCode;
        this.defaultMessage = defaultMessage;
        this.detailMessage = "";
    }

    public CommonException(int statusCode, String defaultMessage, String detailMessage) {
        this.statusCode = statusCode;
        this.defaultMessage = defaultMessage;
        this.detailMessage = detailMessage;
    }

    public String getMessage() {
        if (this.defaultMessage.isEmpty()) {
            return  "[" + defaultMessage + "] " + detailMessage;
        }
        return defaultMessage;
    }
}
