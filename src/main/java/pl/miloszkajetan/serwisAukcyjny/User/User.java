package pl.miloszkajetan.serwisAukcyjny.User;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity

public class User extends BaseEntity {

    private String login;
    private String password;
    private String accountName;
    @OneToOne
    private UserData userData;


}
