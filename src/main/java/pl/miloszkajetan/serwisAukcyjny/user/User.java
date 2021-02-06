package pl.miloszkajetan.serwisAukcyjny.user;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User extends BaseEntity {
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private String city;
    private String address;
    private String accountStatus;
    private String accountType;

    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;

}
