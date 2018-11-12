package yang.springframework.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(value = {"yang.springframework.jokes"}) //default is base project package like this.
@ImportResource("classpath:chuck-config.xml")
public class JokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeApplication.class, args);
    }
}
