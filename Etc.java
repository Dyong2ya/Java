package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트연산자
		 * -|, &, ^, ~, <<, >>
		 * -비트단위로 연산한다.
		 * 
		 * 기타 연산자
		 * -.(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용된다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		//1byte : 01010101
		System.out.println(10 | 15); //'| : 둘 다 0인 경우 0 그 외 1'
		//10 : 00001010
		//15 : 00001111
		//	   00001111
		
		int x = 10;
		int y = 20;
		
		int result = x < y ? x : y; //int result = x;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2이면 여자
		int regNo = 8;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은" + gender + "입니다.");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은" + gender + "입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자>");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 숫자>");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
////		int num = (num1 > num2) ? num1 : num2;
////		System.out.println(num);
//		System.out.println(num1 < num2 ? num2 : num1);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.println("1,2,3,4 중 한 가지 수를 입력해주세요>");
		int num = Integer.parseInt(sc.nextLine());
		
		gender = num == 1 || num == 3 ? "남자" : 
			(num ==2 || num == 4 ? "여자" : "확인불가");
		
		System.out.println(gender);
		
		
		
		
		
		
		
		
		
		
	}

}
