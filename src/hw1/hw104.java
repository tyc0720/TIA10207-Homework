package hw1;

public class Hw104 {
	// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	public static void main(String[] args) {
		// 定義圓周率跟半徑
		double pi = 3.1415, r = 5;
		// 計算圓面積
		double a = r * r * pi;
		// 計算圓周長
		double b = 2 * r * pi;
		// Print
		System.out.println("圓面積 = " + a + "," + "圓周長 = " + b);

	}

}
