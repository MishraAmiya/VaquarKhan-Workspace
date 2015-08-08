package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchStdMarkRepository;

@Named
public class SchStdMarkDataService {
	@Autowired
	private SchStdMarkRepository schStdMarkRepository;

	public SchStdMarkRepository getSchStdMarkRepository() {
		return schStdMarkRepository;
	}

	public void setSchStdMarkRepository(SchStdMarkRepository schStdMarkRepository) {
		this.schStdMarkRepository = schStdMarkRepository;
	}


}
