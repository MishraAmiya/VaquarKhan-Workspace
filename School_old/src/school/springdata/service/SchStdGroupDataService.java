package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchStdGroupRepository;

@Named
public class SchStdGroupDataService {
	
	@Autowired
	private SchStdGroupRepository schStdGroupRepository;

	public SchStdGroupRepository getSchStdGroupRepository() {
		return schStdGroupRepository;
	}

	public void setSchStdGroupRepository(SchStdGroupRepository schStdGroupRepository) {
		this.schStdGroupRepository = schStdGroupRepository;
	}

}
