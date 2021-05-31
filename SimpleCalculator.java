package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두 개의 숫자와 한 개의 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어 주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오>");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.println("+, -, *, / 중 하나를 선택하시오"); 
		String str = sc.nextLine();
		System.out.println("두번째 숫자를 입력하시오>");
		double num2 = Double.parseDouble(sc.nextLine());
		
		String a = "" + (str.equals("+") ? (num1 + num2) : 
						str.equals("-") ? (num1 - num2) : 
						str.equals("*") ? (num1 * num2) : 
						str.equals("/") ? (num1 / num2) : "해당없음"); 	//String하고  boolean값이랑 같이 있어서 형변환필요한데 (String)이런 거 없어서 " " + 이런 거 붙여주는 거야. 
		System.out.println("값은" + a + "입니다");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println(cal1);
//		String cal2 = "-";
//		cal2 = ""+ (str.equals(cal2) ? (num1 - num2) : "해당없음"); 		
//		System.out.println(cal2);
//		String cal = "*";
//		cal = ""+ (str.equals(cal) ? (num1 * num2) : "해당없음"); 		
//		System.out.println(cal);
//		String cal3 = "/";
//		cal = ""+ (str.equals(cal3) ? (num1 / num2) : "해당없음"); 		
//		System.out.println(cal3);
//		
//		

	}

}
