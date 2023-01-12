package aop.animal1_10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AnimalAspect {
	@Pointcut("execution(public String aop.animal1.*.lunch())")
	void a() {}
	
	@Around("a()")
	public void around(ProceedingJoinPoint p) {
		try {
		String target=p.getTarget().toString(); //aop.animal1.Dog@16진수
		String[] names=target.split("@")[0].split("\\.");
		String classname=names[names.length-1];
		Object o=p.proceed();
		System.out.println(classname+"-"+o+" 먹었군요.");
		} catch(Throwable e) {
			e.printStackTrace();
		}
		//Dog-사료 먹었군요.
	}
}
