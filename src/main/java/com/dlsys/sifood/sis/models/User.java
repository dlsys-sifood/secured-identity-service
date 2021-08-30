package com.dlsys.sifood.sis.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class User {

    private UUID id;
    private String name;
    private String gender;
    private String fatherName;
    private String motherName;
    private String email;
    private String username;
    private String password;
    private String rfc;
    private Integer idCountry;
    private Integer idState;
    private Integer idConty;
    private UUID idFather;
    private Integer idRole;
    private Integer idProfileJob;
    private Date dateRegister;
    private Integer flag;

    public List<String> toList() {

        List<String> response = new ArrayList<String>();
        response.add("Users [id=" + id + ", name=" + name + ", gender=" + gender + ", fatherName=" + fatherName
                + ", motherName=" + motherName + ", email=" + email + ", username=" + username + ", password="
                + password + ", rfc=" + rfc + ", idCountry=" + idCountry + ", idState=" + idState + ", idConty="
                + idConty + ", idFather=" + idFather + ", idRole=" + idRole + ", idPorfileJob=" + idProfileJob
                + ", dateRegister=" + dateRegister + ", flag=" + flag + "]");

        return response;
    }
}
