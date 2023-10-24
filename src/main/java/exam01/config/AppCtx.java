package exam01.config;

import exam01.Great;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정할 때 쓰는 어노테이션
public class AppCtx {
    @Bean
    public Great great() {
        return new Great();
    }
}
