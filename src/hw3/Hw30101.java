package hw3;

import java.util.Scanner;

public class Hw30101 {

	//1.使用者輸入三個數字
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner是類別,sc是變數名稱；建立一個新物件叫sc；
		System.out.println("input numbers");
		int data1 = sc.nextInt();//sc呼叫nextInt方法，得到鍵盤輸入的數字回傳給data1
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		System.out.println("輸入三個數字" + data1 + "," + data2 + "," + data3);
		//2.迴圈最外 : 判斷是否能成立三角形
		if((data1 !=0) && (data2 !=0) && (data3 != 0) && ((data1+data2)>data3) && ((data1+data3)>data2) && ((data2+data3)>data1)) {
			//3.當確認是一個三角形則判斷if為正角形else if等腰三角形else其他三角形
			if ((data1 == data2) && (data2 == data3)) {
				System.out.print("為正三角形");
			}else if ((data1 == data2) || (data2 == data3) || (data1 == data3)) {
				System.out.print("為等腰三角形");
			}else {
				System.out.print("為其他三角形");
			}
		
		}else {
			System.out.print("不是三角形");
		}//最外else
		
		System.out.println();
		
		//4.判斷是否為直角三角形 ((data1 * data1) + (data2 *data2)) == (data3 *data3)
		if((((data1 * data1) + (data2 *data2)) == (data3 *data3)) || (((data1 * data1) + (data3 *data3)) == (data2 *data2)) || (((data3 * data3) + (data2 *data2)) == (data1 *data1))) {
			System.out.print("是直角三角形");
		}else {
			System.out.print("不是直角三角形");
		}
		
	}//main

}//class
