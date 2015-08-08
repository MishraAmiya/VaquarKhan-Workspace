package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchDayPeriodRepository;

@Named
public class SchDayPeriodDataService {

	@Autowired
	private SchDayPeriodRepository schDayPeriodRepository;

	public SchDayPeriodRepository getSchDayPeriodRepository() {
		return schDayPeriodRepository;
	}

	public void setSchDayPeriodRepository(
			SchDayPeriodRepository schDayPeriodRepository) {
		this.schDayPeriodRepository = schDayPeriodRepository;
	}

	
}
