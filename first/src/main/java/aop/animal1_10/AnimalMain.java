package aop.animal1_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
	public static void main(String args[]) {
	ApplicationContext factory = 
			new ClassPathXmlApplicationContext("aop/animal1_10/animal.xml");
	
	Animal [] animals = new Animal[3];
	
	animals[0] = (Animal)factory.getBean("dog");//Dog객체
	animals[1] = (Animal)factory.getBean("cat");//Cat객체
	animals[2] = (Animal)factory.getBean("rabbit");//Rabbit객체
	
	for(Animal a : animals) {
		a.lunch();
	}
}
}
/*1. Dog, Cat, Rabbit, AnimalAspect 클래스 구현 완성
 * 2. animal.xml  */
/*
 오늘은 뭐 먹을거에요 
사료 먹었습니다.
Dog-사료 먹었군요.
오늘은 뭐 먹을거에요 
생선 먹었습니다.
Cat-생선 먹었군요.
오늘은 뭐 먹을거에요 
당근 먹었습니다.
Rabbit-당근 먹었군요.
 * */
