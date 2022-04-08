package projetTpSpring.ecomerce.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.entities.ProduitMatiereAsso;
import projetTpSpring.ecomerce.entities.ProduitMatiereKey;

public interface ProduitMatiiereAssoRepo extends JpaRepository<ProduitMatiereAsso, ProduitMatiereKey> {
}
