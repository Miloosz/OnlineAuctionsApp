package pl.miloszkajetan.serwisAukcyjny.Data;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;


@Getter
@Setter
public class UserRegistration {


    /*

    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String birthdate;
    private String province; // do wyboru z x podanych w liscie.
    private String city;
    private String address;
    private String zip-code;


     */
    @NotEmpty
    private String login;
    @Pattern(regexp = "^(?:(?:(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]))|(?:(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]))|(?:(?=.*[0-9])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]))|(?:(?=.*[0-9])(?=.*[a-z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]))).{8,32}$" )
    private String password;
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)$")
    private String email;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty //W przyszłości dodać kalendarz z możliwością wyboru daty.
    private LocalDate birthdate;
    @NotEmpty
    private String province;
    @NotEmpty
    private String city;
    @NotEmpty
    private String address;
    @NotEmpty
    private String zipcode;


}
