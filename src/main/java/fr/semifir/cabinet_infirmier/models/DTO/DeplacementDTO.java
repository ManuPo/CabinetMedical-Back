package fr.semifir.cabinet_infirmier.models.DTO;

import fr.semifir.cabinet_infirmier.models.Deplacement;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DeplacementDTO {

    private LocalDateTime date;
    private Double cout;
    private String nomInfirmiere;
    private String prenomInfirmiere;
    private String nomPatient;
    private String prenomPatient;

}
