package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchAcademicYear;

@Repository("schAcademicYearRepository")
public interface SchAcademicYearRepository extends CrudRepository<SchAcademicYear,Integer>{
	
}
