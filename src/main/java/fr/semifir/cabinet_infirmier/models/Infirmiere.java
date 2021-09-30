package fr.semifir.cabinet_infirmier.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "infirmiere")
public class Infirmiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "numeroProfessionnel")
    private Integer numeroProfessionnel;

    @Column(name= "nom")
    private String nom;

    @Column(name= "prenom")
    private String prenom;

    @Column(name= "telPro")
    private String telPro;

    @Column(name= "telPerso")
    private String telPerso;

    @ManyToOne
    @JoinColumn(name= "adresse_id", referencedColumnName = "id")
    private Adresse adresse;


}
