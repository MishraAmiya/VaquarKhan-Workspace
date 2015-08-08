package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchSchoolNotice;
@Repository("schSchoolNoticeRepository")
public interface SchSchoolNoticeRepository  extends CrudRepository< SchSchoolNotice,Integer>{

}
