package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Include;

import mil.pusdalops.webui.common.GFCBaseController;

public class MainWindowController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5672033070925008437L;

	private static final Logger log = Logger.getLogger(MainWindowController.class);
	
	private Include mainInclude, profileInclude;
	
	public void onCreate$mainWindow(Event event) throws Exception {
		log.info("MainWindowController activated");
	}

	public void onClickDashboard01Menu(Event event) throws Exception {
		log.info("onClickDashboardMenu..."+event.getData());
		
		mainInclude.setSrc("~./plbn/Dashboard01.zul");
		profileInclude.setSrc("~./plbn/Profile.zul");
	}
	
	public void onClickDashboard02Menu(Event event) throws Exception {
		log.info("onClickDashboard02Menu..."+event.getData());

		mainInclude.setSrc("~./plbn/Dashboard02.zul");
		profileInclude.setSrc("~./plbn/Profile.zul");
	}
	
	public void onClickDashboard03Menu(Event event) throws Exception {
		log.info("onClickDashboard03Menu..."+event.getData());
		
		mainInclude.setSrc("~./plbn/Dashboard03.zul");
		profileInclude.setSrc("~./plbn/Profile.zul");
	}
	
	public void onClickPendaftaranMenu(Event event) throws Exception {
		log.info("onClickPendaftaranMenu..."+event.getData());
		
		mainInclude.setSrc("~./plbn/Pendaftaran.zul");
	}
	
	public void onClickPerhitunganMenu(Event event) throws Exception {
		log.info("onClickPerhitunganMenu..."+event.getData());
		
		mainInclude.setSrc("~./plbn/Perhitungan.zul");
	}
	
	public void onClickDaftarHitamPutihMenu(Event event) throws Exception {
		log.info("onClickDaftarHitamPutihMenu..."+event.getData());
	}
	
	public void onClickPesanMenu(Event event) throws Exception {
		log.info("onClickPesanMenu..."+event.getData());
	}
	
	public void onClickPelaporanMenu(Event event) throws Exception {
		log.info("onClickPelaporanMenu..."+event.getData());
	}
	
	public void onClickKejadianMenonjolMenu(Event event) throws Exception {
		log.info("onClickKejadianMenonjolMenu..."+event.getData());
		
		mainInclude.setSrc("~./plbn/KejadianMenonjol.zul");
	}
	
	public void onClickSettingsMenu(Event event) throws Exception {
		log.info("onClickSettingsMenu..."+event.getData());
		
		mainInclude.setSrc("~./plbn/Settings.zul");
	}
}
