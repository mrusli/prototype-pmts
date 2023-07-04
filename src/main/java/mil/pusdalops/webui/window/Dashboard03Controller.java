package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.chart.Charts;
import org.zkoss.chart.Legend;
import org.zkoss.chart.Series;
import org.zkoss.chart.YAxis;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class Dashboard03Controller extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1290486891063117826L;

	private static final Logger log = Logger.getLogger(Dashboard03Controller.class);
	
	private Charts chart;
	
	public void onCreate$dashboardPanel(Event event) throws Exception {
		log.info("Dashboard03Controller Created...");
		
		chart.getTitle().setAlign("left");
		
        // Primary y axis
        YAxis yAxis1 = chart.getYAxis();
        yAxis1.getLabels().setFormat("");
        // yAxis1.getLabels().setStyle("color: " + themeColors[1]);
        yAxis1.setTitle("Jumlah Notifikasi");
        // yAxis1.getTitle().setStyle("color: " + themeColors[1]);
        
        // Secondary y axis
        YAxis yAxis2 = chart.getYAxis(1);
        yAxis2.setTitle("Tidakan");
        // yAxis2.getTitle().setStyle("color: " + themeColors[0]);
        yAxis2.getLabels().setFormat("{value}");
        // yAxis2.getLabels().setStyle("color: " + themeColors[0]);
        yAxis2.setOpposite(true);
        
        Legend legend = chart.getLegend();
        legend.setAlign("left");
        legend.setX(80);
        legend.setVerticalAlign("top");
        legend.setY(80);
        legend.setFloating(true);
        legend.setBackgroundColor("rgba(255,255,255,0.25)");
        initSeries();        
	}

	private void initSeries() {
        Series precipitation = new Series();
        precipitation.setName("Notifikasi");
        precipitation.setType("column");
        precipitation.setYAxis(1);
        precipitation.setData(WeatherData.getPrecipitation());
        precipitation.getTooltip().setValueSuffix("");
        chart.addSeries(precipitation);

        Series temperature = new Series();
        temperature.setName("Tindakan");
        temperature.setType("spline");
        temperature.setData(WeatherData.getTemperature());
        temperature.getTooltip().setValueSuffix("");
        chart.addSeries(temperature);
		
	}
}
