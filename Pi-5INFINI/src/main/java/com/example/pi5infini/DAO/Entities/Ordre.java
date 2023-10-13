package com.example.pi5infini.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Ordre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ordre_Id ;
    typeOrdre typeOrdre;
    int quantiteinstrument;
    float prixLimites;
    Date date;
    @ManyToOne
    @JsonIgnore
    Transaction transaction;
}
