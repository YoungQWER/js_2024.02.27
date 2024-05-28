package ex06;

interface Square{
	int square(int x);
}

public class test3 {
	
	public static void main(String[] args) {
		
		Square sq = new Square() {
			
			public int square(int x) {
				return x*x;
			}
		};
		
		System.out.println(sq.square(5));
	}
}


//int square(int x) {
//
//	   return x*x;
//	}