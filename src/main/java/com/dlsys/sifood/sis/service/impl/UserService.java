package com.dlsys.sifood.sis.service.impl;

import com.dlsys.sifood.sis.models.User;
import com.dlsys.sifood.sis.models.UserAuth;
import com.dlsys.sifood.sis.proxy.IUserManagmentProxy;
import com.dlsys.sifood.sis.response.EntityResponse;
import com.dlsys.sifood.sis.service.IUserService;
import feign.FeignException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserManagmentProxy userProxy;

    @Override
    public ResponseEntity<?> getUsers(UserAuth userAuth) {
        UserAuth userResponse = new UserAuth();
        if(userAuth.getUsername().isEmpty() || userAuth.getPassword().isEmpty() ) {
            return EntityResponse.getEmptyFieldsRequired();
        }
        ResponseEntity<?> response = null;
        Map<String, Object> body = new HashMap<>();
        try{
             response = userProxy.getAuthenticationUser(userAuth.getUsername(), userAuth.getPassword());
             body = (Map<String, Object>) response.getBody();
        }catch (FeignException ex){
            throw new RuntimeException(ex);
        }
        catch (RuntimeException e){
            return EntityResponse.getEmptyFieldsRequired();
        }

        if(response.getStatusCode().equals(HttpStatus.OK)) {
        }
        return null;
    }
}
