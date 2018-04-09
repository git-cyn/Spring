package Chapter_04;

import org.aspectj.lang.annotation.*;

/**
 * 观众类，定义为切面类
 * Created by admin on 2018/3/13.
 */

@Aspect
public class Audience {

    /*
     * 定义命名的切点
     */
    @Pointcut("execution(* Chapter_04.Performance.perform(..))")
    public void performance(){

    }

    /*
     * 定义前置通知
     */
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("停止打电话");
    }

    /*
     * 定义后置通知
     */
    @AfterReturning("performance()")
    public void takeSeats(){
        System.out.println("鼓掌");
    }

    /*
     * 定义异常通知
     */
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("退票");
    }

    /*
     * 定义环绕通知
     */
//    @Around("performance()")
//    public void watchPerformance(ProceedingJoinPoint jp){
//        try {
//            System.out.println("停止打电话");
//            System.out.println("鼓掌");
//
//            jp.proceed();
//
//            System.out.println("clap!clap!clap!");
//
//        } catch (Throwable e) {
//            System.out.println("退票");
//        }
//    }

}
