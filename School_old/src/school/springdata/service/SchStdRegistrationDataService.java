package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchStdRegistrationRepository;

@Named
public class SchStdRegistrationDataService {
 @Autowired
	private SchStdRegistrationRepository schStdRegistrationRepository;

public SchStdRegistrationRepository getSchStdRegistrationRepository() {
	return schStdRegistrationRepository;
}

public void setSchStdRegistrationRepository(
		SchStdRegistrationRepository schStdRegistrationRepository) {
	this.schStdRegistrationRepository = schStdRegistrationRepository;
}

	
}
