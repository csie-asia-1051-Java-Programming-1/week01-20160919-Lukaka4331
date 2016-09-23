package hw;
import java.util.Scanner;
public class hw03_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
		//105021044 鐘岑哲
		Scanner scn=new Scanner(System.in);
	System.out.println("a=");
		 float a=scn.nextFloat();
		 Math.round(a);
		 System.out.println("b=");
		float b=scn.nextFloat();
		 Math.round(b);
		 float gg1=Math.min(a, b);
		System.out.println("c=");
		float c=scn.nextFloat();
		 Math.round(c);
		 float gg2=Math.min(gg1, c);
		System.out.println("d=");
		float d=scn.nextFloat();
		 Math.round(d);
		 float gg3=Math.min(gg2, d);
		System.out.println("e=");
		float e=scn.nextFloat();
		 Math.round(e);
		 float gg4=Math.min(gg3, e);

		System.out.println("f=");
		float f=scn.nextFloat();
		 Math.round(f);
		 float gg5=Math.min(gg4, c);
		 System.out.println("最小值="+gg5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}