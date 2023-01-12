package aop.animal1_10;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
	
	public String lunch() {
		String food="생선";
		System.out.println(food+" 먹었습니다.");
		return food;
	}
}