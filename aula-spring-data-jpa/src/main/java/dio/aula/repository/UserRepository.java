package dio.aula.repository;

import dio.aula.model.User;



import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);
        User findByName(String name);
       
        User findByPassword(String password);
        User findByNameAndEmail(String name, String email);
        User findByNameAndPassword(String name, String password);
        
    
        
    }

