package pl.miloszkajetan.serwisAukcyjny.user;

import lombok.Builder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Builder
public class UserRegistrationBuilder {

    public static User userRegistration(UserRegistration userRegistration, PasswordEncoder passwordEncoder) {


        return User.builder()
                .login(userRegistration.getLogin())
                .password(passwordEncoder.encode(userRegistration.getPassword()))
                .email(userRegistration.getEmail())
                .firstName(userRegistration.getFirstName())
                .lastName(userRegistration.getLastName())
                .phoneNumber(userRegistration.getPhoneNumber())
                .city(userRegistration.getCity())
                .address(userRegistration.getAddress())
                .userRole(UserRoleEnum.USER)
                .build();

    }


}
