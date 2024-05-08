package hw3;
//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息

import java.util.Scanner;

public class Hw302 {
	public static void main(String[] args) {
		System.out.println("開始猜數字吧!");
		//1.隨機輸入一個數字a
		Scanner sc = new Scanner(System.in);//Scanner是類別,sc是變數名稱；建立一個新物件叫sc；
		int a = sc.nextInt();//sc呼叫nextInt方法，得到鍵盤輸入的數字回傳給a
		int b;
		b = (int)(Math.random() * 9);
		System.out.println(b);
		while(a == b) {
			System.out.println("答對了!答案就是" + b);
			break;
		}
		while(a != b) {
			System.out.println("答錯了!");
			a = sc.nextInt();
			if(a == b) {
				System.out.println("答對了!答案就是" + b);
			}
			
		}
		
	}//main
	
}//class
