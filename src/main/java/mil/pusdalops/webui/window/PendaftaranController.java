package mil.pusdalops.webui.window;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Image;

import mil.pusdalops.webui.common.GFCBaseController;

public class PendaftaranController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6600614960560640810L;

	private static final Logger log = Logger.getLogger(PendaftaranController.class);
	
	private Image mainImage, mainPhoto;
	
	public void onCreate$pendaftaranPanel(Event event) throws Exception {
		log.info("PendaftaranController Created...");
		
		File imgFile = new File("/pusdalops/img/sample/smplktp2.png");
		log.info(imgFile.getName());
		
		BufferedImage imgMain = null;
		try {
			imgMain = ImageIO.read(imgFile);
		} catch (Exception e) {
			throw e;
		}
		mainImage.setContent(imgMain);
		
		imgFile = new File("/pusdalops/img/sample/smplphoto1.png");
		log.info(imgMain.getPropertyNames());
		
		BufferedImage imgPhoto = null;
		try {
			imgPhoto = ImageIO.read(imgFile);
		} catch (Exception e) {
			throw e;
		}
		mainPhoto.setContent(imgPhoto);
		
	}
}
