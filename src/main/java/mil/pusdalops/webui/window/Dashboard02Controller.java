package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class Dashboard02Controller extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7505313106489028586L;

	private static final Logger log = Logger.getLogger(Dashboard02Controller.class);
	
	public void onCreate$dashboardPanel(Event event) throws Exception {
		log.info("Dashboard02Controller Createad...");
	}
}
