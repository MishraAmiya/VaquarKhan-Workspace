package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchClassTimeTableLineRepository;

@Named
public class SchClassTimeTableLineDataService {

	@Autowired
	private SchClassTimeTableLineRepository  schClassTimeTableLineRepository;

	public SchClassTimeTableLineRepository getSchClassTimeTableLineRepository() {
		return schClassTimeTableLineRepository;
	}

	public void setSchClassTimeTableLineRepository(
			SchClassTimeTableLineRepository schClassTimeTableLineRepository) {
		this.schClassTimeTableLineRepository = schClassTimeTableLineRepository;
	}

}
