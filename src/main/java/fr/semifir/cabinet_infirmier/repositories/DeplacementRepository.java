package fr.semifir.cabinet_infirmier.repositories;

import fr.semifir.cabinet_infirmier.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeplacementRepository extends JpaRepository<Deplacement, Integer> {

    @Query("SELECT * FROM deplacement WHERE infirmiere_id = ?1")
    List<Deplacement> findByInfirmiereId(Integer id);

    @Query("SELECT * FROM deplacement WHERE patient_id = ?1")
    List<Deplacement> findByPatientId(Integer id);
}
