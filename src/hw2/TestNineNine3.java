package hw2;

public class TestNineNine3 {
	public static void main(String[] args) {
		// 最外層的while迴圈
		int n = 1;
		while (n <= 9) {
			// 第二層do while迴圈
			int m = 1;
			do {
				int a = n * m;
				System.out.print(n + "*" + m + "=" + a + " ");
				m++;
			} while (m <= 9);
			System.out.println(" ");
			n++;
		} // while
	}// main

}// class
