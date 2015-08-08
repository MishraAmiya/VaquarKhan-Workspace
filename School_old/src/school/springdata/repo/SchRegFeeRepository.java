package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchRegFee;
@Repository("schRegFeeRepository")
public interface SchRegFeeRepository extends CrudRepository< SchRegFee,Integer>{

}
