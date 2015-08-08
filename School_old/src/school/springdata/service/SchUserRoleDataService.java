package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchUserRoleRepository;

@Named
public class SchUserRoleDataService {

	@Autowired 
	private SchUserRoleRepository schUserRoleRepository;

	public SchUserRoleRepository getSchUserRoleRepository() {
		return schUserRoleRepository;
	}

	public void setSchUserRoleRepository(SchUserRoleRepository schUserRoleRepository) {
		this.schUserRoleRepository = schUserRoleRepository;
	}
	
}
