package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021044     鐘岑哲
 */






import java.util.Scanner;
public class ex02_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		
		System.out.println("請輸入公斤=");
		int BBB=scn.nextInt();
		float v1=BBB*(0.45359f);
		System.out.println("結果="+v1);
		
		
		
		
		
		
	}

}
