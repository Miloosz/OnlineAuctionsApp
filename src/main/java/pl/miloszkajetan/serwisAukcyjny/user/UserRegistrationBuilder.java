package pl.miloszkajetan.serwisAukcyjny.user;

import lombok.Builder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.Instant;
import java.time.LocalDate;

@Builder
public class UserRegistrationBuilder {

    public static User userRegistration(UserRegistration userRegistration, PasswordEncoder passwordEncoder) {

        User user = new User();
        User.builder()
                .login(user.getLogin())
                .password(passwordEncoder.encode(user.getPassword()))
                .email(user.getEmail())
                .firstName(userRegistration.getFirstName())
                .lastName(userRegistration.getLastName())
                .phoneNumber(userRegistration.getPhoneNumber())
                .city(userRegistration.getCity())
                .address(userRegistration.getAddress())
                .userRole(UserRoleEnum.USER)
                .build();
        return null;
    }


}
