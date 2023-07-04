package mil.pusdalops.webui.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	private static final Logger log = Logger.getLogger(MainController.class);
	
	public MainController() {
		super();

		log.info("Main Controller activated...");
	}

	@GetMapping("/main")
	public String landing() {
		
		return "plbn/Main";
	}

	@GetMapping("/main02")
	public String landing02() {
		
		return "plbn/Main02";
	}

}
