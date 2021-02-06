package pl.miloszkajetan.serwisAukcyjny.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.miloszkajetan.serwisAukcyjny.exceptations.UserExistsException;

import java.util.Optional;


@Service
public class UserRegistrationService {

    private PasswordEncoder passwordEncoder;

    private UsersRepository usersRepository;

    @Autowired
    public UserRegistrationService(PasswordEncoder passwordEncoder, UsersRepository usersRepository) {
        this.passwordEncoder = passwordEncoder;
        this.usersRepository = usersRepository;
    }

    public void registerFunction(UserRegistration userRegistration) {
        User user = UserRegistrationBuilder.userRegistration(userRegistration, passwordEncoder);
        Optional<User> byUsername = usersRepository.findByLogin(user.getLogin());
        if (byUsername.isPresent()) {
            throw new UserExistsException("Ten użytkownik " + user.getLogin() + " już istnieje.");
        } else {
            addUser(user);
        }
    }

    private void addUser(User user) {
        user.setUserRole(UserRoleEnum.USER);
        usersRepository.save(user);
    }

}
