package yang.springframework.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import yang.springframework.jokes.model.FakeDataSource;

@SpringBootApplication
@ComponentScan(value = {"yang.springframework.jokes"}) //default is base project package like this.
@ImportResource("classpath:chuck-config.xml")
public class JokeApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(JokeApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
    }
}
