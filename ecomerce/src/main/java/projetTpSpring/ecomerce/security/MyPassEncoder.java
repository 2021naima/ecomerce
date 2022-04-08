package projetTpSpring.ecomerce.security;

import org.springframework.security.crypto.password.PasswordEncoder;

//@Service
public class MyPassEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        if(encode(rawPassword).equals(encodedPassword))
        return true;
        else
            return false;
    }
}
