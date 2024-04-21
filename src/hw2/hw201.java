package hw2;

public class hw201 {
// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main(String[] args) {
		int sum = 0;
		for(int a = 2; a <= 1000; a=a+2) {
			sum = sum + a;
		}
		System.out.print(sum);
	}
	
}
