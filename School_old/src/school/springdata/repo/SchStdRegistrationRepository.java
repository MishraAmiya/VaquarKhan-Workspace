package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchStdRegistration;
@Repository("sSchStdRegistrationRepository")
public interface SchStdRegistrationRepository  extends CrudRepository<SchStdRegistration,Integer>{

}
