package projetTpSpring.ecomerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.security.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
}
