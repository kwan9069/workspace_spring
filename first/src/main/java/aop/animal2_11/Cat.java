package aop.animal2_11;

public class Cat implements Animal{
	
	public String lunch() {
		String food="생선";
		System.out.println(food+" 먹었습니다.");
		return food;
	}
}