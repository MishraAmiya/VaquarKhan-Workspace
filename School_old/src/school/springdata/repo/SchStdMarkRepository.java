package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchStdMark;
@Repository("schStdMarkRepository")
public interface SchStdMarkRepository extends CrudRepository<SchStdMark,Integer>{ 

}
