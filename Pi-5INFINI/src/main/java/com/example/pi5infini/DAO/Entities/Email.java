package com.example.pi5infini.DAO.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Builder

public class Email {
    private String recipient;
    private String msgBody;
    private String subject;
    private byte[]   attachement;

}