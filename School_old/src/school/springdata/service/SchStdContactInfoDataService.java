package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchStdContactInfoRepository;

@Named
public class SchStdContactInfoDataService {

	@Autowired
	private SchStdContactInfoRepository schStdContactInfoRepository;

	public SchStdContactInfoRepository getSchStdContactInfoRepository() {
		return schStdContactInfoRepository;
	}

	public void setSchStdContactInfoRepository(
			SchStdContactInfoRepository schStdContactInfoRepository) {
		this.schStdContactInfoRepository = schStdContactInfoRepository;
	}

	
	
}
