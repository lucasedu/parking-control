package com.api.parkingcontrol.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntityNotFoundationException extends RuntimeException {

    public EntityNotFoundationException(final String mensagem) {
        super(mensagem);
    }
    
}
