package s_02.javaconfig.xszp01;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //@Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>
public class CDPlayerConfig {

  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }

  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
