package pl.miloszkajetan.serwisAukcyjny.User;

import lombok.Getter;

@Getter
public enum UserRoleEnum {

    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String userRoleName;

    UserRoleEnum(String userRoleName) {
        this.userRoleName = userRoleName;
    }

}
