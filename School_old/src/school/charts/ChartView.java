package school.charts;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@SessionScoped
public class ChartView implements Serializable {

	@ManagedProperty("#{pieCharts}")
	private PieCharts pieCharts;

	@ManagedProperty("#{barCharts}")
	private BarCharts barCharts;

	//

	public PieCharts getPieCharts() {
		return pieCharts;
	}

	public void setPieCharts(PieCharts pieCharts) {
		this.pieCharts = pieCharts;
	}

	public BarCharts getBarCharts() {
		return barCharts;
	}

	public void setBarCharts(BarCharts barCharts) {
		this.barCharts = barCharts;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static org.apache.log4j.Logger log = Logger
			.getLogger(ChartView.class);

	public PieChartModel pieModel1;

	public PieChartModel pieModel2;

	public BarChartModel barModel1;

	public BarChartModel barModel2;

	public PieChartModel getPieModel1() {

		List<? extends ChartModel> pieChartList = pieCharts.createChartModels();
		//
		if (pieChartList != null && !pieChartList.isEmpty()) {
			pieModel1 = (PieChartModel) pieChartList.get(0);
		}

		return pieModel1;
	}

	public PieChartModel getPieModel2() {
		List<? extends ChartModel> pieChartList = pieCharts.createChartModels();
		//
		if (pieChartList != null && !pieChartList.isEmpty()) {
			pieModel2 = (PieChartModel) pieChartList.get(1);
		}
		return pieModel2;
	}

	public BarChartModel getBarModel1() {
		List<? extends ChartModel> barChartList = barCharts.createChartModels();
		//
		if (barChartList != null && !barChartList.isEmpty()) {
			barModel1 = (BarChartModel) barChartList.get(0);
		}
		return barModel1;
	}

	public BarChartModel getBarModel2() {
		List<? extends ChartModel> barChartList = barCharts.createChartModels();
		//
		if (barChartList != null && !barChartList.isEmpty()) {
			barModel2 = (BarChartModel) barChartList.get(1);
		}

		return barModel2;
	}

	@PostConstruct
	public void init() {
		getPieModel1();
		getBarModel1();
	}

}