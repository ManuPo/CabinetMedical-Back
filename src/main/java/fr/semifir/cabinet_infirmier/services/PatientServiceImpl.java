package fr.semifir.cabinet_infirmier.services;

import fr.semifir.cabinet_infirmier.repositories.PatientRepository;

public class PatientServiceImpl implements PatientService{

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}
