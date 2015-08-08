package school.springdata.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.repo.SchStdAttendanceRepository;

@Named
public class SchStdAttendanceDataService {
	
	@Autowired
	private SchStdAttendanceRepository schStdAttendanceRepository;

	public SchStdAttendanceRepository getSchStdAttendanceRepository() {
		return schStdAttendanceRepository;
	}

	public void setSchStdAttendanceRepository(
			SchStdAttendanceRepository schStdAttendanceRepository) {
		this.schStdAttendanceRepository = schStdAttendanceRepository;
	}

	

}
