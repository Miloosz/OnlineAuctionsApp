package pl.miloszkajetan.serwisAukcyjny.user;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;


@Getter
@Setter
public class UserRegistration {
    @NotEmpty
    private String login;
    @NotEmpty
    private String password;
    //@Pattern(regexp = "^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)$")
    @NotEmpty
    private String email;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty //W przyszłości dodać kalendarz z możliwością wyboru daty.
    private LocalDate birthdate;
    @NotEmpty
    private String phoneNumber;
    @NotEmpty
    private String city;
    @NotEmpty
    private String address;
    @NotEmpty
    private String zipcode;


}
