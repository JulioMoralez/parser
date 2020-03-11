package pack.repo;

import org.springframework.data.repository.CrudRepository;
import pack.model.User;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findAll();
}
