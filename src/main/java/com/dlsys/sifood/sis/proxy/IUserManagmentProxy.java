package com.dlsys.sifood.sis.proxy;

import com.dlsys.sifood.sis.models.UserAuth;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@FeignClient(name = "food-user-service", url = "localhost:8082")
public interface IUserManagmentProxy {
    @RequestMapping(value = "user/getAutentcationUser/username/{username}/password/{password}", method = RequestMethod.GET)
    public ResponseEntity<?> getAuthenticationUser(@PathVariable String username, @PathVariable String password);

}
