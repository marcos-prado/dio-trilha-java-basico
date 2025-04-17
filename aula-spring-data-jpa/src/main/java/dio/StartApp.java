package dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Joana");
        user.setEmail("joana@email");
        user.setPassword("123456");
        userRepository.save(user);

        for(User u : userRepository.findAll()) {
            System.out.println(u);
        }
    }
}
