package com.rafael.pubication.handler;

import com.rafael.pubication.dto.PublicationErrorDTO;
import com.rafael.pubication.service.exception.PublicationException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(PublicationException.class)
    public ResponseEntity<PublicationErrorDTO> publicationNotFound(PublicationException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        PublicationErrorDTO err = new PublicationErrorDTO(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
