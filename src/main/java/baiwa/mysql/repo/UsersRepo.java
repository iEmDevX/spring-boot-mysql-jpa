package baiwa.mysql.repo;

import org.springframework.data.repository.CrudRepository;
import baiwa.mysql.model.Users;

public interface UsersRepo extends CrudRepository<Users, Integer>{

}
