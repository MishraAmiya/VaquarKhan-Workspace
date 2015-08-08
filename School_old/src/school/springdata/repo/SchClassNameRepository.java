package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchClassName;

@Repository("schClassNameRepository")
public interface SchClassNameRepository extends CrudRepository<SchClassName,Integer>{

}
