package test.method1;

public class MethodTest2 {
	static void printHead(char c,int cnt) {
		for(int i=0; i<cnt;i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		printHead('★',30);
		System.out.println("유한대학교 ");
		printHead('♥',15);
		System.out.println("메소드 작성 ");
		printHead('◈',20);
		

	}

}

