package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchTimeTable;

@Repository("schTimeTableRepository")
public interface SchTimeTableRepository extends CrudRepository<SchTimeTable,Integer>{

}
