package pl.miloszkajetan.serwisAukcyjny.Data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class UserData extends BaseEntity {

    private String firstName;
    private String lastName;
    private LocalDate age;
    private long phoneNumber;
    private String province;
    private String city;
    private String address;
    private String createdDate;
    private String accountStatus;
    private String accountType;

}
