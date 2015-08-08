package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchTeacherSubAssignRepository;
@Named
public class SchTeacherSubAssignDataService {

	@Autowired 
	private SchTeacherSubAssignRepository schTeacherSubAssignRepository;

	public SchTeacherSubAssignRepository getSchTeacherSubAssignRepository() {
		return schTeacherSubAssignRepository;
	}

	public void setSchTeacherSubAssignRepository(
			SchTeacherSubAssignRepository schTeacherSubAssignRepository) {
		this.schTeacherSubAssignRepository = schTeacherSubAssignRepository;
	}

}
