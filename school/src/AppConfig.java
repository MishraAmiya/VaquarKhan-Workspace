import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import school.service.EnquiryService;
import school.service.EnquiryServiceImpl;


@Configuration
@ComponentScan("school")
public class AppConfig {
  
	 @Bean	
	   public EnquiryService studentService(){
		   return new EnquiryServiceImpl();
	   }


} 