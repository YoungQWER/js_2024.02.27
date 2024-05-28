package ex06;

interface PrintVariable{
	void printVar(String name, int i);
		
}

public class test2 {
	
	public static void main(String[] args) {
		
		PrintVariable result = new PrintVariable() {
			
			public void printVar(String name, int i) {
				System.out.println(name+"="+i);
			}
		};

		result.printVar("name", 20);
	}
}


//int printVar(String name, int i) {
//
//	   System.out.println(name+"="+i);
//	}