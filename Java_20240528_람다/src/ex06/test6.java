package ex06;

interface EmptyArrA{
	int[] emptyArr();
}

public class test6 {
	public static void main(String[] args) {
		
		EmptyArrA a = new EmptyArrA() {
		
			public int[] emptyArr() {
				return new int[] {};
			}
		}; 
		
		int[] ar = a.emptyArr();
	}
}


//int[] emptyArr() {
//
//	   return new int[] {};
//	}