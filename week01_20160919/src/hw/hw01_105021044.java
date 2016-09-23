package hw;
import java.util.Scanner;
public class hw01_105021044 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元
		//105021044 鐘岑哲
		Scanner scn=new Scanner(System.in);
		
		
		System.out.println("請輸入數字=");

		int n=scn.nextInt();
		
	   double v1=Math.ceil(Math.log (n) / (Math.log(2)) );
		
		
		System.out.println("輸出= "+v1);
				

		
		
		
		
		
		
		
		
		
	}

}
