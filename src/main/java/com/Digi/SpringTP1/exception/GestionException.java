package com.Digi.SpringTP1.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GestionException {
    @ExceptionHandler({ExceptionError.class})
    protected ResponseEntity<String> transformerAnomalie(ExceptionError ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
