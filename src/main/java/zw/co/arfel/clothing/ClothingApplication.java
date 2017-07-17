package zw.co.arfel.clothing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by ezinzombe on 7/14/17.
 */
@SpringBootApplication
public class ClothingApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ClothingApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClothingApplication.class);
    }

}
