package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchStudentInfo;
@Repository("schStudentInfoRepository")
public interface SchStudentInfoRepository  extends CrudRepository<SchStudentInfo,Integer>{

}
