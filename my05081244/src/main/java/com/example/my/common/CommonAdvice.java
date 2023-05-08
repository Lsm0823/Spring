package com.example.my.common;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CommonAdvice {
    // 이름이 Controllerapi라는 이름을 가진 모든것을 지켜보고 있다.
    // @Before("bean(*ControllerApi*)")

    // @Before("within(com.example.my..controller.*)")

//    @Before("execution(public * com.example.my..controller..*(..))")
//    public void tempAdvice(){
//        log.warn("요청이 들어왔습니다.");
//    }

    @Around("execution(public * com.example.my.todo.repository..findByIdx(..))")
    public Object checkFindByIdx(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // proceedingJoinPoint.proceed() -> 리파지토리의 findByIdx 함수 그자체
        // proceedingJoinPoint.getArgs() -> 리파지토리의 findByIdx 매개변수 그 자체, 매개변수는 여러개 가능하기 때문에 List형식으로 받음
        Object result = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());

        if(result == null){
            throw new EntityNotFoundException("해당하는 데이터가 없습니다 ㅎㅎ.");
        }

        return result;
    }
}
