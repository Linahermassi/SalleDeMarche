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
public class Strategie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int stratégie_id;
    String description;
    float Performance;
    String risque;
    Date datecreation;
    @ManyToMany(mappedBy = "strategieList")
    @JsonIgnore
    List<Instrument> instrumentList;
    @OneToMany(mappedBy = "strategie")
    @JsonIgnore
    List<IndicateurTechnique> indicateursTechniques;
    @OneToMany(mappedBy = "strategie")
    @JsonIgnore
    List<ParametreStrategie> parametreStrategies;
}
