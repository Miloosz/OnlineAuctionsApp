package pl.miloszkajetan.serwisAukcyjny.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    @Query("SELECT ur FROM UserRole ur WHERE ur.userRoleName = '1' ")

    UserRole findUserRoleByUserRoleName(String userRoleName);

}
