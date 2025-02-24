package com.nimbusnex.appHub.exception;

import com.nimbusnex.appHub.model.response.ErrorResponse;
import com.nimbusnex.appHub.util.Constant;
import com.nimbusnex.appHub.util.ExceptionMessagesAndCodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ErrorResponse> handleInternalServerErrorException(InternalServerErrorException e) {
        logger.warn("{}, Handle Internal Server Exception ,{}", Constant.EXCEPTION_STARTS, Constant.EXCEPTION_ENDS);
        ErrorResponse errorResponse = new ErrorResponse(
                ExceptionMessagesAndCodes.INTERNAL_SERVER_ERROR_STATUS,
                ExceptionMessagesAndCodes.INTERNAL_SERVER_ERROR_CODE,
                e.getMessage()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
