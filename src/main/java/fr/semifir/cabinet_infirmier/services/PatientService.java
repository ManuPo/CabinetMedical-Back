package fr.semifir.cabinet_infirmier.services;

import fr.semifir.cabinet_infirmier.models.DTO.DeplacementDTO;
import fr.semifir.cabinet_infirmier.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatients();
    Patient getPatient(Integer id);
    Patient postPatient(Patient patient);
    Patient putPatient(Patient patient);
    void deletePatient(Integer id);
    List<DeplacementDTO> getDeplacements(Integer id);
}
