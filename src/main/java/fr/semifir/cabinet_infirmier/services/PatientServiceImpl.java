package fr.semifir.cabinet_infirmier.services;

import fr.semifir.cabinet_infirmier.models.DTO.DeplacementDTO;
import fr.semifir.cabinet_infirmier.models.Deplacement;
import fr.semifir.cabinet_infirmier.models.Patient;
import fr.semifir.cabinet_infirmier.repositories.DeplacementRepository;
import fr.semifir.cabinet_infirmier.repositories.PatientRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PatientServiceImpl implements PatientService{

    private PatientRepository patientRepository;
    private DeplacementRepository deplacementRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getPatients() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient getPatient(Integer id) {
        return this.patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient postPatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient putPatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Integer id) {
        this.patientRepository.deleteById(id);
    }

    @Override
    public List<DeplacementDTO> getDeplacements(Integer id) {

        List deplacementDTOs = new ArrayList();
        List<Deplacement> deplacements = this.deplacementRepository.findByPatientId(id);

        for (Deplacement deplacement : deplacements){
            DeplacementDTO deplacementDTO = new DeplacementDTO();

            LocalDateTime date = deplacement.getDate();
            Double cout = deplacement.getCout();
            String nomInfirmiere = deplacement.getInfirmiere().getNom();
            String prenomInfirmiere = deplacement.getInfirmiere().getPrenom();

            deplacementDTO.setDate(date);
            deplacementDTO.setCout(cout);
            deplacementDTO.setNomInfirmiere(nomInfirmiere);
            deplacementDTO.setPrenomInfirmiere(prenomInfirmiere);

            deplacementDTOs.add(deplacementDTO);
        }
        return deplacementDTOs;
    }
}
