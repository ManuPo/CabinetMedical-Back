package fr.semifir.cabinet_infirmier.services;

import fr.semifir.cabinet_infirmier.models.DTO.DeplacementDTO;
import fr.semifir.cabinet_infirmier.models.Deplacement;
import fr.semifir.cabinet_infirmier.models.Infirmiere;
import fr.semifir.cabinet_infirmier.repositories.DeplacementRepository;
import fr.semifir.cabinet_infirmier.repositories.InfirmiereRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InfirmiereServiceImpl implements InfirmiereService{

    private InfirmiereRepository infirmiereRepository;
    private DeplacementRepository deplacementRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }

    @Override
    public List<Infirmiere> getInfirmieres() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Infirmiere getInfirmiere(Integer id) {
        return this.infirmiereRepository.findById(id).orElse(null);
    }

    @Override
    public Infirmiere postInfirmiere(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Infirmiere putInfirmiere(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public void deleteInfirmiere(Integer id) {
        this.infirmiereRepository.deleteById(id);
    }

    @Override
    public List<DeplacementDTO> getDeplacements(Integer id) {

        List deplacementDTOs = new ArrayList();
        List<Deplacement> deplacements = this.deplacementRepository.findByInfirmiereId(id);

        for (Deplacement deplacement : deplacements) {
            DeplacementDTO deplacementDTO = new DeplacementDTO();

            LocalDateTime date = deplacement.getDate();
            Double cout = deplacement.getCout();
            String nomPatient = deplacement.getPatient().getNom();
            String prenomPatient = deplacement.getPatient().getPrenom();

            deplacementDTO.setDate(date);
            deplacementDTO.setCout(cout);
            deplacementDTO.setNomPatient(nomPatient);
            deplacementDTO.setPrenomPatient(prenomPatient);

            deplacementDTOs.add(deplacementDTO);
        }
        return deplacementDTOs;
    }
}
