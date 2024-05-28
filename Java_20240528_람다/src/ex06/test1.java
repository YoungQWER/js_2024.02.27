package ex06;

@FunctionalInterface
interface MaxA{
	int max(int a, int b);
}

public class test1 {

	public static void main(String[] args) {
		
		MaxA result = new MaxA() {
			
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		System.out.println(result.max(10,3));
	}
}


//int max(int a, int b) {
//
//	   return a > b ? a : b;
//	}