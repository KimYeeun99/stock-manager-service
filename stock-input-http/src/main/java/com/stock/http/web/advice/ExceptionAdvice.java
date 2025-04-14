package com.stock.http.web.advice;

import com.stock.common.exception.CommonException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionAdvice {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<ExceptionResponse> exception(CommonException exception) {
        return ResponseEntity
                .status(exception.statusCode)
                .body(ExceptionResponse.of(exception));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponse> exception(RuntimeException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ExceptionResponse.of(
                        500,
                        "INTERNAL_SERVER_ERROR",
                        exception.getMessage()));
    }

    /**
     * @Valid 유효성 검사 실패 예외 처리
     * @param exception
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> exception(MethodArgumentNotValidException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ExceptionResponse.of(
                        400,
                        "BAD_REQUEST",
                        exception.getBindingResult().getFieldError().getDefaultMessage()));
    }
}
