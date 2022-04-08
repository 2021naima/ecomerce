package projetTpSpring.ecomerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findByName(String nomp);
}
