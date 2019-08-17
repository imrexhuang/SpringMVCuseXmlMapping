package tw.rex.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//相依注入設定在myMVC-servlet.xml，這裡註解掉
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//相依注入設定在myMVC-servlet.xml，這裡註解掉 
//@ComponentScan(basePackages={"tw.rex.java.spring.controller","tw.rex.java.spring.service"})
public class SpringMvCuseBootApplication extends SpringBootServletInitializer{

	//參考https://coffee0127.github.io/blog/2017/04/26/convert-spring-boot-jar-to-war/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringMvCuseBootApplication.class);
    }
    
	public static void main(String[] args) {
		SpringApplication.run(SpringMvCuseBootApplication.class, args);
	}

}
