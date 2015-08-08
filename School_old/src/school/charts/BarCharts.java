package school.charts;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.springframework.beans.factory.annotation.Autowired;

import school.springdata.dao.ChartViewDao;

@Named
public class BarCharts extends Charts implements ICharts {

	@Autowired
	private ChartViewDao chartViewDao;

	private BarChartModel initBarModel1() {

		BarChartModel model = new BarChartModel();

		ChartSeries noOfExamChart = new ChartSeries();

		List<? extends Charts> barChartList = chartViewDao
				.getSchAcademicYearInfo();
		for (Charts barchart : barChartList) {
			int noOfExam = 0;
			if (barchart.noOfExam != 0) {
				noOfExam = barchart.noOfExam;

			}
			noOfExamChart.set(barchart.acyear, noOfExam);
			noOfExamChart.setLabel(barchart.acyear);

			model.addSeries(noOfExamChart);

		}

		return model;
	}

	private BarChartModel createBarModel1() {

		BarChartModel barModel1 = initBarModel1();

		barModel1.setTitle("School sch Academic Year  Bar Chart");
		barModel1.setLegendPosition("ne");

		Axis xAxis = barModel1.getAxis(AxisType.X);
		xAxis.setLabel("Year");

		Axis yAxis = barModel1.getAxis(AxisType.Y);
		yAxis.setLabel("qty");
		yAxis.setMin(0);
		yAxis.setMax(100);
		return barModel1;
	}

	//

	private BarChartModel initBarModel2() {

		BarChartModel model = new BarChartModel();

		ChartSeries stdPerf = new ChartSeries();

		
		List<? extends Charts> barChartList = chartViewDao.getStudentPerfInfo();
		for (Charts barchart : barChartList) {

			stdPerf.set(barchart.stdPerfId, barchart.perfParamValue);
			stdPerf.setLabel(String.valueOf(barchart.stdPerfId));
			model.addSeries(stdPerf);

		}

		return model;
	}

	private BarChartModel createBarModel2() {

		BarChartModel barModel1 = initBarModel2();

		barModel1.setTitle("School Student performance  Bar Chart");
		barModel1.setLegendPosition("ne");

		Axis xAxis = barModel1.getAxis(AxisType.X);
		xAxis.setLabel("Student Perf Id");

		Axis yAxis = barModel1.getAxis(AxisType.Y);
		yAxis.setLabel("Perf Param");
		yAxis.setMin(0);
		yAxis.setMax(5);
		return barModel1;
	}

	@Override
	public List<BarChartModel> createChartModels() {

		List<BarChartModel> list = new ArrayList<BarChartModel>();
		list.add(createBarModel1());
		list.add(createBarModel2());
		return list;

	}

}
