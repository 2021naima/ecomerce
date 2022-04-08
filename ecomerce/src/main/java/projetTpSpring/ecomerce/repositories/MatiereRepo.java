package projetTpSpring.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.entities.MatierePremiere;

public interface MatiereRepo extends JpaRepository<MatierePremiere,Long> {
    public MatierePremiere findByNom(String nom);
    public MatierePremiere save(MatierePremiere mp);
}
