package Chapter_04;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AudienceConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}