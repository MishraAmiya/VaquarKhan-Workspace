package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchClassNameRepository;

@Named
public class SchClassNameDataService {
	@Autowired
	private SchClassNameRepository schClassNameRepository;

	public SchClassNameRepository getSchClassNameRepository() {
		return schClassNameRepository;
	}

	public void setSchClassNameRepository(
			SchClassNameRepository schClassNameRepository) {
		this.schClassNameRepository = schClassNameRepository;
	}

	

	

}
