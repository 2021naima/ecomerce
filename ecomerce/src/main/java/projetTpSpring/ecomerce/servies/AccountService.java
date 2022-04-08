package projetTpSpring.ecomerce.servies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import projetTpSpring.ecomerce.exception.BadRequestException;
import projetTpSpring.ecomerce.repositories.AppRoleRepository;
import projetTpSpring.ecomerce.repositories.AppUserRepository;
import projetTpSpring.ecomerce.security.AppRole;
import projetTpSpring.ecomerce.security.AppUser;
import projetTpSpring.ecomerce.security.Role;

@Service
public class AccountService implements IaccountService{

    @Autowired
    private AppUserRepository userRepository;
    @Autowired
    private AppRoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AppUser findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public AppUser saveUser(AppUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public AppRole saveRole(AppRole r) {
        AppRole role =roleRepository.findByRole(r.getRole());
        if (role == null ) {
            return roleRepository.save(r);
        }
        else {
            throw new BadRequestException("le role existe déja");
        }
    }

    public void addRoleToUser(String username, Role r) {
        AppUser user=userRepository.findByUsername(username);
        AppRole role =roleRepository.findByRole(r);
        //user.addRole(role);
        user.getRoles().add(role);
        userRepository.save(user);
    }

}
