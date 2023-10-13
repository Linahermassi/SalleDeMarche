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
public class IndicateurTechnique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Indicateur_id;
    String nomIndicateur;
    String descriptionIndicateur;
    @ManyToOne
    @JsonIgnore
    Strategie strategie;
}
