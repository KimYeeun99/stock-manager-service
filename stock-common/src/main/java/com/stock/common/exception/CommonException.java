package com.stock.common.exception;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.constraints.NotNull;
import org.apache.logging.log4j.util.Strings;

public class CommonException extends RuntimeException {
    @NotNull
    public final int statusCode;
    @NotNull
    public final String error;
    private final String message;

    public CommonException(ExceptionCode exception) {
        this.statusCode = exception.getStatusCode();
        this.error = exception.getError();
        this.message = StringUtils.isEmpty(exception.getMessage()) ? Strings.EMPTY : exception.getMessage();
    }
}
