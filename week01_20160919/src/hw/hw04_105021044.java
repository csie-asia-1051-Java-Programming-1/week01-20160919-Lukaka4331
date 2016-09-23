package hw;
import java.util.Scanner;
public class hw04_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
		//105021044 鐘岑哲
		
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入數字=");

		System.out.println("請輸入數字=");
	float a=scn.nextInt();
	float  b=scn.nextInt();

		double v1=Math.pow(a, 1/b);
		
		System.out.println("答案="+v1);
		
		
		

	}

}
