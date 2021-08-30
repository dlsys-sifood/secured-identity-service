package com.dlsys.sifood.sis.service;

import com.dlsys.sifood.sis.models.User;
import com.dlsys.sifood.sis.models.UserAuth;
import org.springframework.http.ResponseEntity;

public interface IUserService {

    public ResponseEntity<?> getUsers(UserAuth userAuth);
}
