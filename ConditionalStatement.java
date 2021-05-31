package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * -if문
		 * -switch문
		 * 
		 * if문
		 * -if(조건식){}: 조건식의 결과가 true라면 블럭 안의 문장을 수행한다.
		 * -else if(조건식){}: 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * -else{}: 조건식 이외의 경우를 추가한다.
		 * -조건이 아무리 많더라도 하나만 실행하고 빠져나온다.
		 * -만약 조건문들 중 true가 많다 하더라도 위의 true문 하나만 실행되고 빠져나온다.
		 */
		
		int a = 3;
		
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 1){
			System.out.println("a == 1");
		}
		else if(a == 2){
			System.out.println("a == 2");
		}
		else if(a == 3){
			System.out.println("a == 3");
		}
		else{
			System.out.println("else");
		}
		
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}
		else if(a < 20){
			System.out.println("a가 20보다 작다.");
		}
		
		//점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 80;
		
		if(score >= 60){
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}
		
		//점수에 등급을 부여
		score = 30;
		String grade = null; //null : 참조형타입의 기본값
		
		if(90 <= score && score <= 100){
			grade = "A";
		}
		else if(80 <= score && score < 90){
			grade = "B";
		}
		else if(70 <= score && score < 80){
			grade = "C";
		}
		else if(60 <= score && score < 70){
			grade = "D";
		}
		else if(50 <= score && score < 40){
			grade = "E";
		}
		else{
			grade = "망했슈~.";
		}
		
		System.out.println(score + "에 해당하는 등급은" + grade + "입니다.");
		
		score = 97;
		grade = null;
		
		if(90 <= score && score < 100){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}
			else if(score <= 93){
				grade += "-";
			}
		}
		else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}
			else if(score <= 83){
				grade += "-";
			}
		}
		else if(70 <= score){
			grade = "c";
			if(77 <= score){
				grade += "+";
			}
			else if(score <= 73){
				grade += "-";
			}
		}
		else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}
			else if(score <= 63){
				grade += "-";
			}
		}
		else{
			grade = "F";
			}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
	
		/*
		 * switch문
		 * -한정적인 값에 많이 사용
		 * -switch(int/String){case 10: break;};
		 * -조건식의 타입과 case식의 타입이 같아야 한다.
		 * -조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용) 허용한다.
		 * -조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * -반드시 default문이 존재하여야 한다.('얘가 약간 나머지, else의 값이라고 생각하면 된다)
		 */
		
		a = 10;
		switch(a){
		case 10:
			System.out.println("a == 10");
			break;
		case 20:
			System.out.println("a == 20");
			break;
		default:
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b == \"a\"");
			break;
		case "b":
			System.out.println("b == \"b\"");
			break;
		default:
			System.out.println("default");	
		}
		
		//월에 해당하는 계절
		int month = 1;
		String season = null;
		
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은" + season + "입니다.");
		
		score = 19;
		grade = null;
		
		switch(score/10){
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5: case 4: case 3: case 2: case 1:
			grade = "망했다";
			break;
		}
		System.out.println(score + "점의 등급은" + grade + "입니다");
		
		
		
//		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력해주세요>");
//		a = Integer.parseInt(sc.nextLine());
//		
//		if(a == 0){
//			System.out.println("0입니다.");
//		}
//		else{
//			System.out.println("0이 아닙니다.");
//		}
		
		
		
//		//숫자를 입력받아 그 숫자가 홀수이니 짝수인지 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력해주세요>");
//		a = Integer.parseInt(sc.nextLine());
//		
//		if(a % 2 == 0){
//			System.out.println("짝수입니다");
//		}
//		else{
//			System.out.println("홀수입니다");
//		}
		
		
		
		//점수 3개를 입력받아 합계, 평균, 등급을 출력해주세요
		Scanner sc = new Scanner(System.in);
			   
		System.out.println("첫번째 숫자를 입력해주세요>");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력해주세요>");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("세번째 숫자를 입력해주세요>");
		double num3 = Double.parseDouble(sc.nextLine());
		
		double sum = num1 + num2 + num3;
		System.out.println("합계: " + sum);
		
		double avg = sum / 3.0;
		System.out.println("평균: " + avg);
		
		if(90 <= avg && avg <= 100){
			grade = "A";
		}
		else if(80 <= avg && avg < 90){
			grade = "B";
		}
		else if(70 <= avg && avg < 80){
			grade = "C";
		}
		else if(60 <= avg && avg < 70){
			grade = "D";
		}
		else if(50 <= avg && avg < 40){
			grade = "E";
		}
		else{
			grade = "망했슈~";
		}
		System.out.println("당신의 총 점수는" + sum + "\n등급은" + grade + "입니다.");
	}
}
		
		
		
//		//1~100사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
//		int x = (int)(Math.random() * 100) + 1;
//		System.out.println(x);
//		int y = (int)(Math.random() * 100) + 1;
//		System.out.println(y);
//		int z = (int)(Math.random() * 100) + 1;
//		System.out.println(z);
//
   		//x를 제일 작게, z를 제일 크게 만들어 보는거야.

//		if(x > y){
//			int t = x;
//			x = y ;
//			y = t;
//		}
//		if(x > z){
//			int t = x;
//			x = z ;
//			y = t;
//		}
//		if(y > z){
//			int t = y;
//			y = z;
//			z = t;
//		}
//			System.out.println(x + "->" + y +"->" + z);
//	}
//	
//	
//	
//}

//		if(random1 < random2 && random1 < random3){	
//		}
//			if(random3 > random2){
//				System.out.println(random1 + "->" + random2 + "->" + random3);
//			}
//			else{
//				System.out.println(random1 + "->" + random3 + "->" + random2);
//			}
//			else if(random2 < random3 && random2 < random1){	
//			}
//			if(random1 > random3){
//				System.out.println(random2 + "->" + random1 + "->" + random3);
//			}
//			else{
//				System.out.println(random2 + "->" + random3 + "->" + random1);
//			}
//			else if(random1 < random2 && random1 < random3){	
//			}
//				if(random3 > random2){
//					System.out.println(random1 + "->" + random2 + "->" + random3);
//				}
//				else{
//					System.out.println(random1 + "->" + random3 + "->" + random2);
//				}
//	}
//}
		

		
		
		
		
		
	


