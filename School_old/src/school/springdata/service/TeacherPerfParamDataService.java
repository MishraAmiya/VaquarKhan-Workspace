package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.TeacherPerfParamRepository;

@Named
public class TeacherPerfParamDataService {

	
	@Autowired 
	private TeacherPerfParamRepository teacherPerfParamRepository;

	public TeacherPerfParamRepository getTeacherPerfParamRepository() {
		return teacherPerfParamRepository;
	}

	public void setTeacherPerfParamRepository(
			TeacherPerfParamRepository teacherPerfParamRepository) {
		this.teacherPerfParamRepository = teacherPerfParamRepository;
	}
}
