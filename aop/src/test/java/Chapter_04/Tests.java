package Chapter_04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AudienceConfig.class)
public class Tests {

    @Autowired
    Performance performance;
    @Test
    public void test() {

//        performance.perform();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Performance performance = (Performance) applicationContext.getBean("performer");
        performance.perform();
    }
}
