package com.example.pi5infini.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Portefeuille implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int portefeuille_Id ;
    float solde;
    @OneToOne
    @JsonIgnore
    User utilisateur;
    @OneToMany(mappedBy = "portefeuille")
    @JsonIgnore
    List<Transaction>transactionList;
}
