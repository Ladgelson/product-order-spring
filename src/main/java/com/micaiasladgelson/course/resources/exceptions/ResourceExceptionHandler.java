package com.micaiasladgelson.course.resources.exceptions;

import com.micaiasladgelson.course.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest req) {
        String error = "Resource not found";
        Integer status = HttpStatus.NOT_FOUND.value();
        StandardError err = new StandardError(Instant.now(), status, error, e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
