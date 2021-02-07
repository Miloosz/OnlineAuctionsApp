package pl.miloszkajetan.serwisAukcyjny.mock;

import org.springframework.stereotype.Service;
import pl.miloszkajetan.serwisAukcyjny.user.User;
import pl.miloszkajetan.serwisAukcyjny.user.UserRoleEnum;
import pl.miloszkajetan.serwisAukcyjny.user.UsersRepository;

import javax.annotation.PostConstruct;

@Service
public class MockData {
    private final UsersRepository usersRepository;

    public MockData(UsersRepository usersRepository) {

        this.usersRepository = usersRepository;
    }

    @PostConstruct
    public void mockDataUser() {
        User user = new User(
                "kot1",
                "kot2",
                "kot@onet.pl",
                "Kajetan",
                "Kotlowski",
                25,
                "567064032",
                "Poznan",
                "Turkusowa 1",
                "Active",
                "Premium",
                UserRoleEnum.USER);
        usersRepository.save(user);
    }
}
