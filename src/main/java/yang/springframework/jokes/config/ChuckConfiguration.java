package yang.springframework.jokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    /**
     * ChuckNorrisQuotes 객체를 'chuckNorrisQuotes' type의 Bean으로 만듦
     * --> Constructor based DI에 사용 가능
     *
     * 없으면 다음과 같은 에러 발생. (ChuckNorrisQuotes 타입의 Bean이 선언되지 않았어요!)
     * Parameter 0 of constructor in yang.springframework.jokes.service.JokeServiceImpl required a bean of type 'guru.springframework.norris.chuck.ChuckNorrisQuotes' that could not be found.
     */
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
