package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.StudentPerfParam;

@Repository("studentPerfParamRepository")
public interface StudentPerfParamRepository  extends CrudRepository<StudentPerfParam,Integer>{

}
