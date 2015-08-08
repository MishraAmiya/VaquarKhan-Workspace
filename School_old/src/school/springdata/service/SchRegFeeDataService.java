package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchRegFeeRepository;

@Named
public class SchRegFeeDataService {

	@Autowired
	private SchRegFeeRepository schRegFeeRepository;

	public SchRegFeeRepository getSchRegFeeRepository() {
		return schRegFeeRepository;
	}

	public void setSchRegFeeRepository(SchRegFeeRepository schRegFeeRepository) {
		this.schRegFeeRepository = schRegFeeRepository;
	}

	
}
