package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=
		 * -문자열 비교: equals()
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = x > y;
		System.out.println(b);

		b = x <= y - 15; //'연산의 우선순위는 산술연산이 더 높다.'
		System.out.println(b);
	
		//문자열비교
		String str1 = "abc";
		String str2 = "ABC";
		b = str1 == str2; //문자열의 내용이 아닌 '주소'를 비교한 것이다.
		System.out.println(b);

		b = !str1.equals(str2);
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성하시오.
		//1. x가 y보다 크다.
		b = x > y;
		System.out.println(b);
		
		//2. x는 y보다 작거나 같다.
		b = x <= y;
		System.out.println(b);
		
		//3. y는 홀수이다.
		b = y % 2 ==1;
		
		//4. "기본형"과 "참조형"은 다르다.
		String str3 = "기본형";
		String str4 = "참조형";
		b = !str3.equals(str4);
//		b = !"기본형".equals("참조형");
		
		
		
	}
	

}
