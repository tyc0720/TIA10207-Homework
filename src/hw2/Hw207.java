package hw2;
//請設計一隻Java程式,輸出結果為以下:
//A(&#065;)
//BB(&#066;)
//CCC(&#067;)
//DDDD(&#068;)
//EEEEE(&#069;)
//FFFFFF(&#070;)

public class Hw207 {
	public static void main(String[] args) {
		for(int i = 65; i <= 70; i++) {
			for(int j = 65; j <= i; j++) {
				System.out.print((char)i + " ");
			}//for內-橫
			System.out.println();
		}//for外-縱
		
	}//main
	
}//class
