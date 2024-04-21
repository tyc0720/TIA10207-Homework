package hw2;

public class TestNineNine1 {

	public static void main(String[] args) {
		//最外層的for迴圈
		for(int n = 1; n <= 9; n++) {
			//第二層while迴圈
			int m = 0;
			while(m < 9) {
				m++;
				int a = n * m;
				System.out.print(n + "*" + m + "=" + a + " ");
			}
			System.out.println("");
			
		}
		
	}
	
	
}
