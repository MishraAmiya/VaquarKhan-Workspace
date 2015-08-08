package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchTimeTableRepository;
@Named
public class SchTimeTableDataService {

	
	@Autowired 
	private SchTimeTableRepository schTimeTableRepository;

	public SchTimeTableRepository getSchTimeTableRepository() {
		return schTimeTableRepository;
	}

	public void setSchTimeTableRepository(
			SchTimeTableRepository schTimeTableRepository) {
		this.schTimeTableRepository = schTimeTableRepository;
	}
}
