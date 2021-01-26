package pl.miloszkajetan.serwisAukcyjny.Data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository <User, Long> { //Zapytać Olka o <T extends User>

    Optional<User> findByUsername (String accountName);

    boolean findIfUserExists (String accountName);

}
