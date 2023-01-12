package aop.animal1_10;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
	
	public String lunch() {
		String food="사료";
		System.out.println(food+"사료 먹었습니다.");
		return food;
	}
}
