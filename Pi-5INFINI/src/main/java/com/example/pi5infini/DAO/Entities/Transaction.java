package com.example.pi5infini.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Transaction_Id ;
    float montant;
    Date dateTransaction;
    int quantite;
    @ManyToOne
    @JsonIgnore
    Portefeuille portefeuille;
    @OneToMany(mappedBy = "transaction")
    @JsonIgnore
    List<Ordre> ordreList;

}
