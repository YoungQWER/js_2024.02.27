package ex06;

interface RollA{
	int roll();
}


public class test4 {
	public static void main(String[] args) {
		
		RollA ro = new RollA() {
			public int roll() {
				return (int)(Math.random()*6);
			}
		};
		
		System.out.println(ro.roll());
	}
}



//int roll() {
//
//	   return (int)(Math.random() * 6);
//	}