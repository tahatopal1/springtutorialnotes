package com.example.springaop17.aop;

import com.example.springaop17.model.SampleModel2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advices {

    @Before("execution(public void com.example.*.model.SampleModel.method1())")
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Before("execution(public * method2(..))")
    public void beforeMethod2(){
        System.out.println("Before method 2");
    }

    @After("execution(public * com.*.method3(*))")
    public void afterMethod(){
        System.out.println("After method");
    }

    @After("pointcutMethod()")
    public void afterMethod2(){
        System.out.println("After method 2");
    }

    @After("pointcutMethod2()")
    public void joinPointMethod(JoinPoint joinPoint){
        System.out.println("This is joinpoint method (After)");
        System.out.println("Method: ".concat(joinPoint.toString()));
        System.out.println("Signature: ".concat(joinPoint.getSignature().toString()));
        System.out.println("Target:".concat(joinPoint.getTarget().toString()));
        System.out.println("Kind: ".concat(joinPoint.getKind()));
    }

    @AfterReturning(value = "pointcutMethod3()", returning = "sampleModel2")
    public void afterReturningMethod(JoinPoint joinPoint, SampleModel2 sampleModel2){
        System.out.println("This is joinpoint method (After Returning)");
        System.out.println("Method: ".concat(joinPoint.toString()));
        System.out.println("Signature: ".concat(joinPoint.getSignature().toString()));
        System.out.println("Target:".concat(joinPoint.getTarget().toString()));
        System.out.println("Kind: ".concat(joinPoint.getKind()));
        System.out.println("Modal: ".concat(sampleModel2.toString()));

    }

    @AfterThrowing(pointcut = "pointcutMethod4()", throwing = "exception")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception exception){
        System.out.println("This is joinpoint method (After Throwing)");
        System.out.println("Method: ".concat(joinPoint.toString()));
        System.out.println("Signature: ".concat(joinPoint.getSignature().toString()));
        System.out.println("Target:".concat(joinPoint.getTarget().toString()));
        System.out.println("Kind: ".concat(joinPoint.getKind()));
        System.out.println("Modal: ".concat(exception.getMessage()));
    }

    @Around("pointcutMethod5()")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("Around before: " + proceedingJoinPoint);
            proceedingJoinPoint.proceed();
            System.out.println("Around after: " + proceedingJoinPoint);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    @Before("@annotation(com.example.springaop17.annotation.CustomAnnotation)")
    public void annotationMethod(){
            System.out.println("Before Method for annotation");
    }

    @Pointcut("within(com.example.springaop17.model.SampleModel)")
    public void pointcutMethod(){

    }

    @Pointcut("execution(* method4(*))")
    public void pointcutMethod2(){

    }

    @Pointcut("execution(public * com.example.springaop17.model.SampleModel.method5(..))")
    public void pointcutMethod3(){

    }

    @Pointcut("execution(public * com.example.springaop17.model.SampleModel2.method(..))")
    public void pointcutMethod4(){

    }

    @Pointcut("execution(public * com.example.springaop17.model.SampleModel2.method1())")
    public void pointcutMethod5(){

    }

}
