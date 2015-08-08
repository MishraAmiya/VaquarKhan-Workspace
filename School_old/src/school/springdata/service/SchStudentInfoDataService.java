package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchStudentInfoRepository;

@Named

public class SchStudentInfoDataService {

	@Autowired
	private SchStudentInfoRepository schStudentInfoRepository;

	public SchStudentInfoRepository getSchStudentInfoRepository() {
		return schStudentInfoRepository;
	}

	public void setSchStudentInfoRepository(
			SchStudentInfoRepository schStudentInfoRepository) {
		this.schStudentInfoRepository = schStudentInfoRepository;
	}
	
}
