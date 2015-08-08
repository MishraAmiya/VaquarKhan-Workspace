package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchTeacherInfoRepository;
@Named
public class SchTeacherInfoDataService {

	@Autowired 
	private SchTeacherInfoRepository schTeacherInfoRepository;

	public SchTeacherInfoRepository getSchTeacherInfoRepository() {
		return schTeacherInfoRepository;
	}

	public void setSchTeacherInfoRepository(
			SchTeacherInfoRepository schTeacherInfoRepository) {
		this.schTeacherInfoRepository = schTeacherInfoRepository;
	}
	
}
