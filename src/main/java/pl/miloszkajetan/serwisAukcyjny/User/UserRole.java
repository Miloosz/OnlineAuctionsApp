package pl.miloszkajetan.serwisAukcyjny.User;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class UserRole extends BaseEntity {

    private String userRoleName;

    public UserRole(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public UserRole() { //bez tego nie chcialo dzialac
    }

}
