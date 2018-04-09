package example2;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodBeforeAdviceImpl implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		System.out.println("运行前检查... ");
		System.out.println("Method: " + method.getName());
		System.out.println("Args: " + Arrays.asList(args));
		System.out.println("Object: " + obj);
	}
}
