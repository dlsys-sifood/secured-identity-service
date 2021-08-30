package com.dlsys.sifood.sis.response;

import com.dlsys.sifood.sis.dto.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EntityResponse {

    private static final String BADREQUESTCODE = HttpStatus.BAD_REQUEST.toString();
    private static final String BADREQUESTDESCRIPTION = "BAD REQUEST";

    private static final String NOTFOUNDCODE = HttpStatus.NOT_FOUND.toString();
    private static final String NOTFOUNDDESCRIPTION = "NOT FOUND";

    private static final String OKREQUESTCODE = HttpStatus.OK.toString();
    private static final String OKREQUESTDESCRIPTION = "OK";

    public static ResponseEntity<?> getEmptyFieldsRequired(){
        return new ResponseEntity<Map<String, Object>>(ListResponse
                .getGenericResponse(new GenericResponse(BADREQUESTCODE, BADREQUESTDESCRIPTION,
                        GenericResponse.toList("empty fields"))),
                HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<?> getNotFoundMessage(){
        return new ResponseEntity<Map<String, Object>>(ListResponse
                .getGenericResponse(new GenericResponse(BADREQUESTCODE, BADREQUESTDESCRIPTION,
                        GenericResponse.toList("the credentials are incorrectly"))),
                HttpStatus.BAD_REQUEST);
    }


}
