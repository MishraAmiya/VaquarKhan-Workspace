package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.StudentPerfRepository;

@Named
public class StudentPerfDataService {
	/**
	 * 
	 */
	@Autowired
	private StudentPerfRepository studentPerfRepository;

	public StudentPerfRepository getStudentPerfRepository() {
		return studentPerfRepository;
	}

	public void setStudentPerfRepository(StudentPerfRepository studentPerfRepository) {
		this.studentPerfRepository = studentPerfRepository;
	}

	
}
