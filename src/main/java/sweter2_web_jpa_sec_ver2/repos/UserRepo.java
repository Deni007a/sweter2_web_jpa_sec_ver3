package  sweter2_web_jpa_sec_ver2.repos;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import  sweter2_web_jpa_sec_ver2.domain.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {
    // ищем пользователя по имени
    // https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
    User findByUsername(String username);
}
