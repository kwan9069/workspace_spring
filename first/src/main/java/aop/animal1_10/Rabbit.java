package aop.animal1_10;

import org.springframework.stereotype.Component;

@Component
public class Rabbit implements Animal{
	
	public String lunch() {
		String food="당근";
		System.out.println(food+"사료 먹었습니다.");
		return food;
	}
}