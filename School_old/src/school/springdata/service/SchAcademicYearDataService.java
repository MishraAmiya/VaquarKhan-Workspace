package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchAcademicYearRepository;

@Named
public class SchAcademicYearDataService {

	@Autowired
	private SchAcademicYearRepository schAcademicYearRepository;

	public SchAcademicYearRepository getSchAcademicYearRepository() {
		return schAcademicYearRepository;
	}

	public void setSchAcademicYearRepository(
			SchAcademicYearRepository schAcademicYearRepository) {
		this.schAcademicYearRepository = schAcademicYearRepository;
	}

	

}
