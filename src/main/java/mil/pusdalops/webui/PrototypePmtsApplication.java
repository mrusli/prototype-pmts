package mil.pusdalops.webui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({
	"classpath*:ApplicationContext-GuiController.xml"})
public class PrototypePmtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototypePmtsApplication.class, args);
	}

}
