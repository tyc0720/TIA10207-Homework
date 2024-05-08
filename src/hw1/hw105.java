package hw1;

public class Hw105 {
	// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
	// 金加利息共有多少錢 (用複利計算,公式請自行google)
	// 複利公式 期末 = 期初*(1+利率)的期數次方
	// S代表期末，P代表期初，n代表期數，i代表利率。
	public static void main(String[] args) {
		// 定義變數
		double i = 0.02, p = 1500000, e = 1 + i;
		double s = p * e;
		// 計算循環利率
		for (int n = 1; n <= 10; n++) {
			s = p * Math.pow(e, n);
		}

		// print
		System.out.println("本金加利息共有" + s + "元");

	}

}
