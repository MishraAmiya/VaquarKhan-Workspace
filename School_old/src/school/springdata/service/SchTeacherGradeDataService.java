package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchTeacherGradeRepository;

@Named
public class SchTeacherGradeDataService {

	
	@Autowired 
	private SchTeacherGradeRepository schTeacherGradeRepository;

	public SchTeacherGradeRepository getSchTeacherGradeRepository() {
		return schTeacherGradeRepository;
	}

	public void setSchTeacherGradeRepository(
			SchTeacherGradeRepository schTeacherGradeRepository) {
		this.schTeacherGradeRepository = schTeacherGradeRepository;
	}
	
	
}
