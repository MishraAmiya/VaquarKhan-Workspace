package school.springdata.dao;

import java.util.List;

import school.charts.Charts;

public interface IChartViewDao {

	public String BEAN_ID = "chartViewDao";

	public List<? extends Charts> getSchAcademicYearInfo();

	public List<? extends Charts> getStudentPerfInfo();

	

}
