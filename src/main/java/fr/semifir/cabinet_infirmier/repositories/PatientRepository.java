package fr.semifir.cabinet_infirmier.repositories;

import fr.semifir.cabinet_infirmier.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
