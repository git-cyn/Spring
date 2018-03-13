package Chapter_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/3/14.
 */
@Component
public class Performer implements Performance {
    public void perform() {
        System.out.println("表演开始");
    }
}
