package pl.miloszkajetan.serwisAukcyjny.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UsersRepository usersRepository; //dzieki Olek działa!!!

    public void registerFunction (UserRegistration userRegistration) {


    }


}
