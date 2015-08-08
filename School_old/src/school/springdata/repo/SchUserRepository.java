package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchUser;
@Repository("schUserRepository")
public interface SchUserRepository  extends CrudRepository<SchUser,Integer>{

}
