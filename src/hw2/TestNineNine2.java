package hw2;

public class TestNineNine2 {

	public static void main(String[] args) {
		// 最外層的for迴圈
		for (int n = 1; n <= 9; n++) {
			// 第二層do while迴圈
			int m = 0;
			do {
				m++;
				int a = n * m;
				System.out.print(n + "*" + m + "=" + a + " ");
			} while (m < 9);
			System.out.println(" ");
		} // for
	}// main

}// class
