package com.dlsys.sifood.sis.controller;

import com.dlsys.sifood.sis.models.UserAuth;
import com.dlsys.sifood.sis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/proxy", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@RequestBody UserAuth userAuth){
        return userService.getUsers(userAuth);
    }

}
