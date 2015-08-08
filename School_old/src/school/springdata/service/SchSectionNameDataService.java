package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchSectionNameRepository;

@Named
public class SchSectionNameDataService {
	
	@Autowired
	private SchSectionNameRepository schSectionNameRepository;

	public SchSectionNameRepository getSchSectionNameRepository() {
		return schSectionNameRepository;
	}

	public void setSchSectionNameRepository(
			SchSectionNameRepository schSectionNameRepository) {
		this.schSectionNameRepository = schSectionNameRepository;
	}
	


}
