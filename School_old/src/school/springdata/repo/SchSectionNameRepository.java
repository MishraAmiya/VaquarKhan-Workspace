package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchSectionName;
@Repository("schSectionNameRepository")
public interface SchSectionNameRepository extends CrudRepository< SchSectionName,Integer>{

}
