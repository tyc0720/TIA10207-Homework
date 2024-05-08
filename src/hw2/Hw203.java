package hw2;

public class Hw203 {
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	public static void main(String[] args) {
		int pro = 1;
		int a = 1;
		while (a <= 10) {
			pro = pro * a;
			a++;
		}//while
		System.out.println(pro);
		
	}//main
	
}//class