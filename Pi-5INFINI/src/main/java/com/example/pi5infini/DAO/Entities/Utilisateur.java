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
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int user_Id;
    String mdp;
    String nom;
    String prenom;
    String email;
    @OneToMany
    @JsonIgnore
    List<Utilisateur> utilisateurList;
    @ManyToOne
    @JsonIgnore
    Role role;
}
