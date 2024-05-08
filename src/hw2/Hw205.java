package hw2;

public class Hw205 {
	/*
	 * 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式, 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	 */
	public static void main(String[] args) {
		int i = 0;
		for (int a = 1; a <= 49; a++) {
			if ((a % 10 != 4) && (a < 40)) {
				System.out.print(a + " ");
				i++;
			} // if

		} // for
		System.out.println(" ");
		System.out.print(i);
	}// main

}// class
