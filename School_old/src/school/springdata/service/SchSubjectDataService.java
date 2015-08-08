package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchSubjectRepository;

@Named
public class SchSubjectDataService {

	
	@Autowired
	private SchSubjectRepository schSubjectRepository;

	public SchSubjectRepository getSchSubjectRepository() {
		return schSubjectRepository;
	}

	public void setSchSubjectRepository(SchSubjectRepository schSubjectRepository) {
		this.schSubjectRepository = schSubjectRepository;
	}
	
}

