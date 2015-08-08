package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchStdAttendance;
@Repository("schStdAttendanceRepository")
public interface SchStdAttendanceRepository extends CrudRepository<SchStdAttendance,Integer>{

}
