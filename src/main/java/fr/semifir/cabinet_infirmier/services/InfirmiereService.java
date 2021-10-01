package fr.semifir.cabinet_infirmier.services;

import fr.semifir.cabinet_infirmier.models.DTO.DeplacementDTO;
import fr.semifir.cabinet_infirmier.models.Infirmiere;

import java.util.List;

public interface InfirmiereService {
    List<Infirmiere> getInfirmieres();
    Infirmiere getInfirmiere(Integer id);
    Infirmiere postInfirmiere(Infirmiere infirmiere);
    Infirmiere putInfirmiere(Infirmiere infirmiere);
    void deleteInfirmiere(Integer id);
    List<DeplacementDTO> getDeplacements(Integer id);
}
