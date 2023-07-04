package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class PerhitunganController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3891915359556643278L;

	private static final Logger log = Logger.getLogger(PerhitunganController.class);
	
	public void onCreate$perhitunganPanel(Event event) throws Exception {
		log.info("PerhitunganController Created...");
	}
}
