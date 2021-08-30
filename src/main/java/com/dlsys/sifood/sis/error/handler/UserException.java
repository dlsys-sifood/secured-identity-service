package com.dlsys.sifood.sis.error.handler;

public class UserException extends RuntimeException {
    public UserException(String message) {
        super("Usuario con ID: ".concat(message).concat(" no existe en el sistema"));
    }
    private static final long serialVersionUID = 1L;
}
