package projetTpSpring.ecomerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import projetTpSpring.ecomerce.security.AppRole;
import projetTpSpring.ecomerce.security.Role;


public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
  public AppRole findByRole(Role r);

}
