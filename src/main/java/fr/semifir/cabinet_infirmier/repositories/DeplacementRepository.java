package fr.semifir.cabinet_infirmier.repositories;

import fr.semifir.cabinet_infirmier.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DeplacementRepository extends JpaRepository<Deplacement, Integer> {

    @Query("SELECT d FROM Deplacement d WHERE d.infirmiere=?1")
    List<Deplacement> findByInfirmiereId(Integer id);

    @Query("SELECT d FROM Deplacement d WHERE d.patient=?1")
    List<Deplacement> findByPatientId(Integer id);
}
