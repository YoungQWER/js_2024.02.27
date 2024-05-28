package ex02;

interface Printable{
	void print(String msg);
}


public class Lambda2 {

	public static void main(String[] args) {
		
		//람다...
		Printable prn = new Printable() {
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		
		prn.print("출력할 메세지......");
	}

}