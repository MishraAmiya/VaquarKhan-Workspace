package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchTeacherSubAssign;

@Repository("SchTeacherSubAssignRepository")

public interface SchTeacherSubAssignRepository  extends CrudRepository<SchTeacherSubAssign,Integer>{

}
