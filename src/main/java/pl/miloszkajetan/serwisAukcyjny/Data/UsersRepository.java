package pl.miloszkajetan.serwisAukcyjny.Data;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository <T extends User> extends JpaRepository <T, Long> { //Zapytać Olka o <T extends User>

    Optional<T> findByUsername (String accountName);

    boolean findIfUserExists (String accountName);

}
