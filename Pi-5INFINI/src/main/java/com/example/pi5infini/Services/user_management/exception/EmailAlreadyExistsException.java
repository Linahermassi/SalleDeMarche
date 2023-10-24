package com.example.pi5infini.Services.user_management.exception;
    public class EmailAlreadyExistsException extends RuntimeException {

        public EmailAlreadyExistsException(String email) {
            super("Email " + email + "already exists");
        }

    }

