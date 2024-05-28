package ex07;

interface MaxA{
	int max(int a, int b);
}

public class test1 {

	public static void main(String[] args) {

		/*
		람다....
		매개변수 자료형 삭제가능
		반환 타입이 있는 경우 -> {} 안에는 return 기입
		반환 타입이 없는 경우 -> {} 안에는 return 생략
		*/
		MaxA result = (a, b) ->	a > b ? a : b;
				
		//메소드참조
		MaxA result2 = Integer::max;
		
		System.out.println(result.max(100,300));
		System.out.println(result2.max(10,3));
	}
}


//int max(int a, int b) {
//
//	   return a > b ? a : b;
//	}