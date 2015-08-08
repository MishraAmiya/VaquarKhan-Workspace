package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchUserRole;

@Repository("schUserRoleRepository")

public interface SchUserRoleRepository extends CrudRepository<SchUserRole,Integer> {

}
