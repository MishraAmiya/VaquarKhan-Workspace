package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchExamTitleRepository;

@Named
public class SchExamTitleDataService {

	@Autowired
	private SchExamTitleRepository schExamTitleRepository;

	public SchExamTitleRepository getSchExamTitleRepository() {
		return schExamTitleRepository;
	}

	public void setSchExamTitleRepository(
			SchExamTitleRepository schExamTitleRepository) {
		this.schExamTitleRepository = schExamTitleRepository;
	}
	
	

}
