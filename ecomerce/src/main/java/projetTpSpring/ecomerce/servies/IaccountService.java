package projetTpSpring.ecomerce.servies;


import projetTpSpring.ecomerce.security.AppRole;
import projetTpSpring.ecomerce.security.AppUser;
import projetTpSpring.ecomerce.security.Role;

public interface IaccountService {
    public AppUser findUserByUsername(String username);
    public AppUser saveUser(AppUser user);
    public AppRole saveRole(AppRole r);
    public void addRoleToUser(String username, Role r);



}
