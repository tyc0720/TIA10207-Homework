package hw3;
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)

import java.util.Scanner;

public class Hw301 {
	//1.使用者輸入三個數字
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner是類別,sc是變數名稱；建立一個新物件叫sc；
		System.out.println("input numbers");
		int data1 = sc.nextInt();//sc呼叫nextInt方法，得到鍵盤輸入的數字回傳給data1
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		System.out.println("輸入三個數字" + data1 + "," + data2 + "," + data3);
		//2.迴圈最外 : 判斷是否能成立三角形
		if((data1 !=0) && (data2 !=0) && (data3 != 0)) {
			if((((data1+data2)>data3) && ((data1+data3)>data2) && ((data2+data3)>data1)) && 
				((Math.abs(data1-data2))<data3) || ((Math.abs(data1-data3))<data2) || ((Math.abs(data2-data3))<data1) ) {
				//3.若成立(是一個三角形)，則判斷為何種三角形
				
			}else {
				System.out.print("不是三角形");
			}
		}else {
			System.out.print("不是三角形");
		}//最外面的if
		
	}//main
	
	
	

}//class
