package fr.semifir.cabinet_infirmier.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="patient")
public class Patient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "nom")
    private String nom;

    @Column(name= "prenom")
    private String prenom;

    @Column(name= "date_de_naissance")
    private LocalDate dateDeNaissance;

    @Column(name= "sexe")
    private String sexe;

    @Column(name= "numero_securite_sociale")
    private String numeroSecuriteSociale;

    @ManyToOne
    @JoinColumn(name= "adresse_id", referencedColumnName = "id")
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name= "infirmiere_id", referencedColumnName = "id")
    private Infirmiere infirmiere;
}
