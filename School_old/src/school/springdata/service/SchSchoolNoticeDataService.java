package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchSchoolNoticeRepository;

@Named
public class SchSchoolNoticeDataService {
@Autowired
	private SchSchoolNoticeRepository schSchoolNoticeRepository;

public SchSchoolNoticeRepository getSchSchoolNoticeRepository() {
	return schSchoolNoticeRepository;
}

public void setSchSchoolNoticeRepository(
		SchSchoolNoticeRepository schSchoolNoticeRepository) {
	this.schSchoolNoticeRepository = schSchoolNoticeRepository;
}
	

}
