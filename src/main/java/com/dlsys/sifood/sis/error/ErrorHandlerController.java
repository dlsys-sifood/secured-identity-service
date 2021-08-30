package com.dlsys.sifood.sis.error;

import com.dlsys.sifood.sis.dto.GenericResponse;
import com.dlsys.sifood.sis.error.handler.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@RestController
@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(UserException.class)
    public final ResponseEntity<Object> handleException(UserException ex, WebRequest request){
        List<String> messages = new ArrayList<String>();
        messages.add("ha surgido un error a la hora de consultar los usuarios");
        messages.add(ex.getMessage());
        GenericResponse response = new GenericResponse(HttpStatus.INTERNAL_SERVER_ERROR.toString(), "Internal Server Error", messages);
        return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
