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
public class Actualite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actualite_Id ;
    String objet;
    String categorie;
    String description;
}
