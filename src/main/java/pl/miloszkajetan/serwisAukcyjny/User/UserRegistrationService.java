package pl.miloszkajetan.serwisAukcyjny.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private PasswordEncoder passwordEncoder; //pytanie 1

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UsersRepository<User> usersRepository; //pytanie 2

    public void registerFunction (UserRegistration userRegistration) {


    }


}
