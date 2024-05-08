package hw2;

public class Hw206 {
/*請設計一隻Java程式,輸出結果為以下:
	1 2 3 4 5 6 7 8 9 10
	1 2 3 4 5 6 7 8 9
	1 2 3 4 5 6 7 8
	1 2 3 4 5 6 7
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1*/
	public static void main(String[] args) {
		for(int a = 10; a >=1; a--) {
			for(int b = 1; b <= a;b++) {
				System.out.print(b + " ");
			
		}//for
		System.out.println();
		}
	}//main

}//class
