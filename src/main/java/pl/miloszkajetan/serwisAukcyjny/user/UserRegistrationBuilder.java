package pl.miloszkajetan.serwisAukcyjny.user;

import lombok.Builder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Builder
public class UserRegistrationBuilder {

    public static User userRegistration (UserRegistration userRegistration, PasswordEncoder passwordEncoder){

        User user = new User();
         // Builder nie działa :(
                // @Builder, czy mógłbyś powiedzieć, dlaczego i kiedy się go używa? Dzięki!


        return null;
    }


}
