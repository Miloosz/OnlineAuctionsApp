package pl.miloszkajetan.serwisAukcyjny.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository <User, Long> {

    Optional<User> findByUsername (String accountName);

    boolean findIfUserExists (String accountName);

}
