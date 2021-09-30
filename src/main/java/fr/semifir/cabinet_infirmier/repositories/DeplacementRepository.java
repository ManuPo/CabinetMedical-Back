package fr.semifir.cabinet_infirmier.repositories;

import fr.semifir.cabinet_infirmier.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeplacementRepository extends JpaRepository<Deplacement, Integer> {
}
