package hw4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
public class Hw403 {

	public static void main(String[] args) {
		int sum = 0;
		String[] stringArray = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for (int i = 0; i < stringArray.length; i++) {
			char[] charArray = stringArray[i].toCharArray();
			for (int y = 0; y < charArray.length; y++) {
				char alphabet = charArray[y];
				if (charArray[y] == 'a' || charArray[y] =='e' || charArray[y] =='i' || charArray[y] =='o' || charArray[y] =='u') {
					sum++;
				}
			}
		}
		System.out.print(sum);
	}
}