package ex07;

interface EmptyArrA{
	int[] emptyArr();
}

public class test6 {
		
		EmptyArrA a = () -> 
				 new int[] {};
		
		int[] ar = a.emptyArr();
	}


//int[] emptyArr() {
//
//	   return new int[] {};
//	}