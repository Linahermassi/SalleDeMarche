package com.example.pi5infini.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String firstName ;
    private String lastName;
    private String email;


    private String password;
    private double phoneNumber;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    //@Enumerated(value = EnumType.STRING)
    //private Role role;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @Column(name = "email_verified")
    private boolean emailVerified;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @Temporal(TemporalType.DATE)
    private Date updateDate;


    @OneToOne(mappedBy = "utilisateur")
    @JsonIgnore
    Portefeuille portefeuille;
    @ManyToOne
    @JsonIgnore
    Formation formation;

    public User(String username, String email,String firstName, String lastName,Gender gender, double phoneNumber,String encode){
        this.username = username;
        this.email = email;
        this.firstName = firstName ;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber ;
        this.password = encode;


    }

//    public User(String username, String email, String encode) {
//
//    }
}
