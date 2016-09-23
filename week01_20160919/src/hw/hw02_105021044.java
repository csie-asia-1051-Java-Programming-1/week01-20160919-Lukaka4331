package hw;
import java.util.Scanner;
import java.util.Random;




public class hw02_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
		//105021044 鐘岑哲
		Scanner scn=new Scanner(System.in);
			System.out.println("請輸入數字=");
			int a =scn.nextInt();
		Random rnd=new Random() ;
		int v1=rnd.nextInt(a)+1;
		System.out.println("輸出數字="+v1);
		int v2=rnd.nextInt(a)+1;
		System.out.println("輸出數字="+v2);
		int v3=rnd.nextInt(a)+1;
		System.out.println("輸出數字="+v3);
		int v4=rnd.nextInt(a)+1;
		System.out.println("輸出數字="+v4);
		int v5=rnd.nextInt(a)+1;
		System.out.println("輸出數字="+v5);
		int v6=rnd.nextInt(a)+1;
		System.out.println("輸出數字="+v6);
		

		
		
		
		
		
		
	}

}
