package fr.semifir.cabinet_infirmier.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "adresse")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="numero")
    private String numero;

    @Column(name= "rue")
    private String rue;

    @Column(name= "cp")
    private Integer cp;

    @Column(name= "ville")
    private String ville;
}
