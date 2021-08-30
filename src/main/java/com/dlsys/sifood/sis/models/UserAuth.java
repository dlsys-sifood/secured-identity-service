package com.dlsys.sifood.sis.models;

import lombok.Data;

@Data
public class UserAuth {
    String username;
    String password;
    String response;
}
