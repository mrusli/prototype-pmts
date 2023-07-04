package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.chart.Charts;
import org.zkoss.chart.Legend;
import org.zkoss.chart.Responsive;
import org.zkoss.chart.Series;
import org.zkoss.chart.plotOptions.SeriesPlotOptions;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class Dashboard01Controller extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1360163499106594435L;

	private static final Logger log = Logger.getLogger(Dashboard01Controller.class);
	
	private Charts chart;
	
	public void onCreate$dashboardPanel(Event event) throws Exception {
		log.info("Dashboard01Controller Created...");
		
		chart.getYAxis().setTitle("Jumlah Orang");
		
		int[] index = new int[] {0};
		LineBasicData.getData().forEach((k, v) -> {
			Series series = chart.getSeries(index[0]++);
			series.setName(k);
			series.setData(v);
		});
		
		Legend legend = chart.getLegend();
		legend.setLayout("vertical");
		legend.setAlign("right");
		legend.setVerticalAlign("middle");
		
		SeriesPlotOptions series = chart.getPlotOptions().getSeries();
		series.getLabel().setConnectorAllowed(false);
		series.setPointStart(2010);
		
		Responsive responsive = chart.getResponsive();
		Responsive.Rule rule = new Responsive.Rule();
		rule.getCondition().setMaxWidth(500);
		Legend legend1 = rule.getChartOptions().getLegend();
		legend1.setLayout("horizontal");
		legend1.setAlign("center");
		legend1.setVerticalAlign("bottom");
		responsive.addRule(rule);
	}
}
