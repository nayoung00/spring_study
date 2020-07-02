package com.springbook.biz.day02.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import com.springbook.biz.day02.user.UserVO;


@Service
@Aspect
// 비즈니스 메소드 수행 후 결과 데이터 리턴 시 동작
public class AfterReturningAdvice {
  @Pointcut("execution(* com.springbook.biz.day02..*Impl.get*(..))")
  public void getPointcut() {}

  @AfterReturning(pointcut = "getPointcut()", returning = "returnObj")
  public void afterLog(JoinPoint jp, Object returnObj) {
    String method = jp.getSignature().getName();
    if (returnObj instanceof UserVO) {
      UserVO user = (UserVO) returnObj;
      if (user.getRole().equals("ADMIN")) {
        System.out.println(user.getName() + " 로그인(ADMIN)");
      }
    }
    System.out.println("[사후 처리]" + method + "()메소드 리턴값:" + returnObj.toString());
  }

}
