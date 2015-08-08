package school.charts;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.primefaces.model.chart.PieChartModel;
import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.dao.ChartViewDao;

@Named
public class PieCharts extends Charts implements ICharts {
	@Autowired
	private ChartViewDao chartViewDao;
	


	private PieChartModel createPieModel1() {
		PieChartModel pieModel1 = new PieChartModel();

		List<? extends Charts> pieChartList = chartViewDao
				.getSchAcademicYearInfo();
		for (Charts pieChart : pieChartList) {
			int noOfExam = 0;
			if (pieChart.noOfExam != 0) {
				noOfExam = pieChart.noOfExam;
			}
			pieModel1.set(pieChart.acyear, noOfExam);
		}
		//
		pieModel1.setTitle("Sch Academic Year");
		pieModel1.setLegendPosition("w");
		return pieModel1;

	}

	private PieChartModel createPieModel2() {
		PieChartModel pieModel2 = new PieChartModel();

		List<? extends Charts> pieChartList = chartViewDao.getStudentPerfInfo();
		for (Charts pieChart : pieChartList) {
			pieModel2.set(String.valueOf(pieChart.stdPerfId),
					pieChart.perfParamValue);
		}
		//
		pieModel2.setTitle("Student Performance");
		pieModel2.setLegendPosition("S");
		return pieModel2;

	}

	@Override
	public List<PieChartModel> createChartModels() {
		List<PieChartModel> list = new ArrayList<PieChartModel>();
		list.add(createPieModel1());
		list.add(createPieModel2());
		return list;

	}

}
