package hw4;

//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
public class Hw401 {

	public static void main(String[] args) {
		int[] intArray1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < intArray1.length; i++) {
			sum += intArray1[i];
		}
		System.out.println("平均值為" + sum / intArray1.length);

		for (int i = 0; i < intArray1.length; i++) {
			if (intArray1[i] > (sum / intArray1.length)) {
				System.out.println(intArray1[i]);
			}
		}

	}// main

}// class
