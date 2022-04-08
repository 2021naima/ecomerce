package projetTpSpring.ecomerce.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByName(String nomc);
}
