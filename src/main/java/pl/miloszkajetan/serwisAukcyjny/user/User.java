package pl.miloszkajetan.serwisAukcyjny.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@Builder

public class User extends BaseEntity {
    private String login;
    private String password;
    private String accountName;
    private String email;

    @OneToOne
    private UserData userData;


}
