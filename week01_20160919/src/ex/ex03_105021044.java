package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 */
import java.util.Scanner;
public class ex03_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
		
		System.out.println("請輸入數字=");
		System.out.println("請輸入數字=");

		int a=scn.nextInt();
		int b=scn.nextInt();
		long v1= (long)Math.pow(a,b);
		
		
		System.out.println("結果="+v1);

		
		
	}

}
