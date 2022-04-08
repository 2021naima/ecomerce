package projetTpSpring.ecomerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.entities.Origine;

public interface OrigineRepo extends JpaRepository<Origine,Long> {
}
