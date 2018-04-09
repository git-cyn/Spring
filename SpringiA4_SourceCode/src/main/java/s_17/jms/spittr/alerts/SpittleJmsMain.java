package s_17.jms.spittr.alerts;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import s_17.jms.spittr.domain.Spittle;

import java.util.Date;

public class SpittleJmsMain {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging.xml");
    AlertService alertService = context.getBean(AlertService.class);
    
    Spittle spittle = new Spittle(1L, null, "Hello", new Date());
    alertService.sendSpittleAlert(spittle);
    
  }

}
