package s_17.jms.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsOperations;
import s_17.jms.spittr.alerts.AlertService;
import s_17.jms.spittr.domain.Spittle;

/**
 * Created by admin on 2018/4/6.
 */
public class ConvertTest2 {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging.xml");
        JmsOperations jms = context.getBean(JmsOperations.class);
        for(int i=0; i< 10; i++) {
            String spittle = (String) jms.receiveAndConvert("hello.queue2");
            System.out.println(spittle);

        }


    }
}
