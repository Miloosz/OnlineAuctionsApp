package pl.miloszkajetan.serwisAukcyjny.User;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
@Getter
@Setter
@Entity
public class UserData extends BaseEntity {

    private String firstName;
    private String lastName;
    private String province;
    private String city;
    private String address;
    private String createdDate;
    private String accountStatus;
    private String accountType;

}
