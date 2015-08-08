package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchStdGroup;
@Repository("schStdGroupRepository")
public interface SchStdGroupRepository extends CrudRepository<SchStdGroup,Integer>{

}
