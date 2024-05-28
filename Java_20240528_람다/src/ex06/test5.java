package ex06;

interface SumarrA{
	int sumArr(int[] arr);
}

public class test5 {
	public static void main(String[] args) {
		
		SumarrA Arr = new SumarrA() {
			
			public int sumArr(int[] arr) {
				int sum = 0;

				for(int i : arr)
					sum += i;
				
				return sum;
			}
		};
		
		int[] num = {1,2,3,4,5};
		System.out.println(Arr.sumArr(num));
	}
}



//int sumArr(int[] arr) {
//
//	   int sum = 0;
//
//	   for(int i : arr) 
//
//	      sum += i;
//
//	   return sum;
//	}