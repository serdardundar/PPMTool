package io.springguru.ppmtool.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author serdardundar
 * @since 03/12/2018
 */
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<ProjectIdExceptionResponse> handleProjectIdException(ProjectIdException ex, WebRequest request) {
        return new ResponseEntity<>(new ProjectIdExceptionResponse(ex.getMessage()), BAD_REQUEST);
    }
}
