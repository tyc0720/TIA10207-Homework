package hw2;

public class Hw202 {
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	public static void main(String[] args) {
		int pro = 1;
		for(int a=1; a<=10; a++) {
			pro = pro * a;
		}
		System.out.println(pro);
	} 
}