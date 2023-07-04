package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class SettingsController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 276672180380052499L;

	private static final Logger log = Logger.getLogger(SettingsController.class);
	
	public void onCreate$settingsPanel(Event event) throws Exception {
		log.info("SettingsController Created...");
	}
}
