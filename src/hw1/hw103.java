package hw1;

public class hw103 {
	//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		int allSec = 256559;
		int allMin = (allSec / 60), Sec = (allSec % 60);
		int allHr = (allMin / 60), Min = (allMin % 60);
		int allDay = (allHr / 24), Hr = (allHr % 24);
		System.out.println(allDay + "天" + Hr + "小時" + Min + "分" + Sec + "秒");
	}
}
