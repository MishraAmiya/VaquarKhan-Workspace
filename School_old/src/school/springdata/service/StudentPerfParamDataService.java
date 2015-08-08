package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.StudentPerfParamRepository;

@Named
public class StudentPerfParamDataService {


	@Autowired 
	private StudentPerfParamRepository studentPerfParamRepository;

	public StudentPerfParamRepository getStudentPerfParamRepository() {
		return studentPerfParamRepository;
	}

	public void setStudentPerfParamRepository(
			StudentPerfParamRepository studentPerfParamRepository) {
		this.studentPerfParamRepository = studentPerfParamRepository;
	}
	
	
	
}
