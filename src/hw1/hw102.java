package hw1;

public class hw102 {
	//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	public static void main(String [] args) {
		int allEggs = 200, aDozen = 12;
		System.out.println("總共是" + (allEggs / aDozen) + "打" + (allEggs % aDozen) + "顆");
		
	}

}
