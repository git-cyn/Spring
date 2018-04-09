package Spring;

import org.springframework.aop.ThrowsAdvice;

import javax.security.auth.login.AccountException;
import java.lang.reflect.Method;

public class ThrowsInterceptor implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object instance,
							  AccountException ex) throws Throwable {

		System.out.println("方法" + method.getName() + " 抛出了异常：" + ex);
	}

	public void afterThrowing(NullPointerException ex) throws Throwable {

		System.out.println("抛出了异常：" + ex);
	}

}
