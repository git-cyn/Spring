package s_17.jms.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import s_17.jms.spittr.alerts.AlertService;
import s_17.jms.spittr.domain.Spittle;

/**
 * Created by admin on 2018/4/6.
 */
public class ConvertTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging.xml");
        AlertService alertService = context.getBean(AlertService.class);
        Spittle spittle = alertService.retrieveSpittleAlert();
        System.out.println(spittle.getMessage());
    }
}
