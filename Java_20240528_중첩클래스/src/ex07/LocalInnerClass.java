package ex07;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	
	public Papers(String msg) { this.msg = msg; }
	
	public Printable getPrinter() {
		
		//ex06 선언, 생성을 하나로 합친다 --> 익명 클래스		
//		Printable tmp = new Printable() {
//			@Override
//			public void print() {
//				System.out.println(msg);
//			}
//		};
		
		//return 그대로 기입
		return new Printable() {
			@Override
			public void print() {
				System.out.println(msg);
			}
		};
	}
}


public class LocalInnerClass {

	public static void main(String[] args) {
		
		Papers p = new Papers("전송할 메세지......");
		
		Printable pa =  p.getPrinter();
		pa.print();
	}

}
