package tw.rex.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//相依注入設定在myMVC-servlet.xml，這裡註解掉
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//相依注入設定在myMVC-servlet.xml，這裡註解掉 
//@ComponentScan(basePackages={"tw.rex.java.spring.controller","tw.rex.java.spring.service"})
public class SpringMvCuseBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvCuseBootApplication.class, args);
	}

}
