package pl.miloszkajetan.serwisAukcyjny.Data;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


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
    @Pattern(regexp = "\\b([A-ZÀ-ÿ][-,a-z. ']+[ ]*)+"  )
    private String firstName;
    @Pattern(regexp = "\\b([A-ZÀ-ÿ][-,a-z. ']+[ ]*)+"  )
    private String lastName;
    @Pattern( regexp = "[0-9]{2}[0-9]{2}[0-9]{4}") //potrzebny kalendarz, błędy np. 0 dzień urodzenia, 0 dzień miesiaca, 1000 rok urodzenia. DO POPRAWY!
    private String birthdate;
    @Pattern(regexp = "\\b([A-zÀ-ÿ][-,a-z])+"   )
    private String province;
    @Pattern(regexp = "\\b([A-ZÀ-ÿ][-,a-z])+"  )
    private String city;
    @Pattern(regexp = "^[#.0-9a-zA-Z\\s,-/]+$")
    private String address;
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}\n")
    private String zipcode;


}
