package aop.animal2_11;

public class Rabbit implements Animal{
	
	public String lunch() {
		String food="당근";
		System.out.println(food+"사료 먹었습니다.");
		return food;
	}
}