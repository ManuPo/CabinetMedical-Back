package fr.semifir.cabinet_infirmier.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "nom")
    private String nom;

    @Column(name= "prenom")
    private String prenom;

    @Column(name= "dateDeNaissance")
    private LocalDateTime dateDeNaissance;

    @Column(name= "sexe")
    private Boolean sexe;

    @Column(name= "numeroSecuriteSocial")
    private Long numeroSecuriteSocial;
}
