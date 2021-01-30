package pl.miloszkajetan.serwisAukcyjny.Data;

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
    private String email;

    @OneToOne
    private UserData userData;


}
