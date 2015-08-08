package school.springdata.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import school.charts.Charts;
import school.springdata.jpa.data.SchAcademicYear;
import school.springdata.jpa.data.StudentPerf;
import school.springdata.service.SchAcadmicDataService;
import school.springdata.service.StudentPerfDataService;

@Named
public class ChartViewDao implements IChartViewDao {
	@Autowired
	private SchAcadmicDataService schAcadmicService;
	@Autowired
	private StudentPerfDataService studentPerfService;

	// fetching data via spring data
	public List<? extends Charts> getSchAcademicYearInfo() {

		Iterable<SchAcademicYear> dataList = schAcadmicService
				.getSchAcademicYearRepository().findAll();
		List<Charts> SchAcademicYearList = new ArrayList<Charts>();

		/*
		 * String sql = "select acyear,no_of_exam from sch_academic_year";
		 */
		try {
			for (SchAcademicYear schAcademicYear : dataList) {
				Charts charts = new Charts();
				charts.setAcyear(schAcademicYear.getAcyear());
				charts.setNoOfExam(schAcademicYear.getNoOfExam());
				SchAcademicYearList.add(charts);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SchAcademicYearList;

	}

	public List<? extends Charts> getStudentPerfInfo() {

		Iterable<StudentPerf> dataList = studentPerfService
				.getStudentPerfRepository().findAll();
		List<Charts> list = new ArrayList<Charts>();

		try {
			for (StudentPerf studentPerf : dataList) {
				Charts charts = new Charts();
				charts.setStdPerfId(studentPerf.getStdPerfId());
				charts.setPerfParamValue(studentPerf.getPerfParamValue());
				charts.setComment(studentPerf.getComment());
				list.add(charts);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

}
