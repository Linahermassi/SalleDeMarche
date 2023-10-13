package com.example.pi5infini.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ParametreStrategie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Parametre_id;
    String nomParametre;
    String valeurParametre;
    String descriptionParametre;
    @ManyToOne
    @JsonIgnore
    Strategie strategie;

}
