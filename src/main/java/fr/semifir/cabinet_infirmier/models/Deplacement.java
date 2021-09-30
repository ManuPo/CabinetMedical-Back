package fr.semifir.cabinet_infirmier.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name= "deplacement")
public class Deplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "date")
    private LocalDateTime date;

    @Column(name= "cout")
    private Double cout;

    @ManyToOne
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="infirmiere_id", referencedColumnName = "id")
    private Infirmiere infirmiere;


}
