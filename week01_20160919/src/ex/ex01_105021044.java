package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021044 鐘岑哲
 */


import java.util.Scanner;


public class ex01_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("請輸入華氏溫度=");
		
		int BBB=scn.nextInt();
		int V2=(BBB-32)*5/9;
	
		
		System.out.println("輸出攝氏溫度="+V2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
