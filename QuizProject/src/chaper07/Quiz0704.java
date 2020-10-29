package chaper07;
import java.util.Scanner;

public class Quiz0704
{

	public static void main(String[] args)
	{
		//섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
		//화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
		//화씨 = 1.8 * 섭씨 + 32
		//섭씨 = (화씨 - 32) / 1.8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 적어주세요");
		double cel = sc.nextInt();
		System.out.println("섭씨 " + cel +" 도의 화씨온도는 " +Celsius(cel) + "입니다");	
		
		System.out.println("화씨 온도를 적어주세요");
		double fah = sc.nextInt();
		System.out.println("화씨 " + fah +" 도의 화씨온도는 " +Fahrenheit(cel) + "입니다");
		
		sc.close();
	}
	
	public static double Celsius(double num) {
		double result = 1.8 * num + 32;
		return result;
	}
	
	public static double Fahrenheit(double num2) {
		double result = (num2 - 32) /1.8;
		return result;
	}

}
