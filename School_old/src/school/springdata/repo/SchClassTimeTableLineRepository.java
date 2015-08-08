package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchClassTimeTableLine;

@Repository("schClassTimeTableLineRepository")
public interface SchClassTimeTableLineRepository extends CrudRepository<SchClassTimeTableLine,Integer>{

}
