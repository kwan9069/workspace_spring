package aop.animal2_11;

import org.aspectj.lang.ProceedingJoinPoint;

public class AnimalAspect {
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
