package fr.semifir.cabinet_infirmier.repositories;

import fr.semifir.cabinet_infirmier.models.Infirmiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfirmiereRepository extends JpaRepository<Infirmiere, Integer> {
}
