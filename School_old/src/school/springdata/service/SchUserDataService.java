package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchUserRepository;

@Named
public class SchUserDataService {

	@Autowired 
	private SchUserRepository schUserRepository;

	public SchUserRepository getSchUserRepository() {
		return schUserRepository;
	}

	public void setSchUserRepository(SchUserRepository schUserRepository) {
		this.schUserRepository = schUserRepository;
	}
	
	
}
