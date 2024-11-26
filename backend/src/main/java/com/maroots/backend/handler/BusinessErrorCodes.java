package com.maroots.backend.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum BusinessErrorCodes {
    NO_CODE(0,HttpStatus.NOT_IMPLEMENTED,"No Code"),
    INCORRECT_CURRENT_PASSWORD(300,HttpStatus.BAD_REQUEST,"Incorrect Current Password"),
    NEW_PASSWORD_DOES_NOT_MATCH(301,HttpStatus.BAD_REQUEST,"Password Does Not Match"),
    ACCOUNT_LOCKED(302,HttpStatus.FORBIDDEN,"Account Locked"),
    ACCOUNT_DISABLED(303,HttpStatus.FORBIDDEN,"Account Disabled"),
    BAD_CREDENTIALS(304,HttpStatus.FORBIDDEN,"Bad Credentials");
    ;
    private final int code;
    private final String description;
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
