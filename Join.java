package a_variable;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 * =========회원가입=========
		 * 아이디>admin
		 * 비밀번호(숫자4자리)>1234
		 * 이름>홍길동
		 * 나이>50
		 * 키>185.5
		 * ========================
		 * 회원가입완료!
		 * =========내정보==========
		 * 아이디: admin
		 * 비밀번호(숫자4자리): 1234
		 * 이름: 홍길동
		 * 나이: 50세
		 * 키: 185.5
		 * =========================
		 */

		System.out.println("=======회원가입=======");
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디>");
		String id = sc.nextLine();
		System.out.println("비밀번호(4자리)>");
		int password = Integer.parseInt(sc.nextLine());
		System.out.println("이름>");
		String name = sc.nextLine();
		System.out.println("나이>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("키>");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("=====================");
		System.out.println("회원가입완료!");
		System.out.println("=========내정보=========");
		System.out.println("아이디 : " + id + "\n비밀번호 : " + password + "\n이름 : " + name + "\n나이 : " + age + "세" +"\n키 : " + height);
//		System.out.println("비밀번호 : " + password );
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age + "세");
//		System.out.println("키 : " + height);
		
		
		
		
		
		
	}

}
