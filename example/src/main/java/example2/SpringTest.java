package example2;

import example1.IService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {

	public static void main(String[] args) {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContex2.xml"));

		// 从配置文件中获取对象
		IService hello = (IService) factory.getBean("service");
		hello.service("Helloween");

		factory.destroySingletons();
	}

}
