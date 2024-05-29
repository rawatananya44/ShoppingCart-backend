package com.shoppingCartbackend.ShoppingCartbackend.exception;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
        @ExceptionHandler(ResourceNotFoundException.class)
        public String HandleResourceNotFoundException(ResourceNotFoundException ex){
            return ex.getMessage();
        }
    }
