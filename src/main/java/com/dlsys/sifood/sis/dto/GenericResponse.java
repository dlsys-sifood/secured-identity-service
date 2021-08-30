package com.dlsys.sifood.sis.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GenericResponse {
    private String statusCode;
    private String statusResponse;
    private List<String> description;

    public GenericResponse(String statusCode, String statusResponse, List<String> description) {
        this.statusCode = statusCode;
        this.statusResponse = statusResponse;
        this.description = description;
    }
    public static List<String> toList(String messages){
        List<String> list = new ArrayList<>();
        list.add(messages);
        return list;
    }
}
