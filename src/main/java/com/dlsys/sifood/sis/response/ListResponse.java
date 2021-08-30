package com.dlsys.sifood.sis.response;

import com.dlsys.sifood.sis.dto.GenericResponse;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ListResponse {
    public static Map<String, Object> getGenericResponse (GenericResponse message){
        Map<String, Object> response = new HashMap<>();
        response.put("response", message);
        return response;
    }

}
