package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		do{
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2 || a1 == a3 || a2 == a3); //같은 게 하나라도 있으면 다시 돌게 세자리 수가 하나라도 겹치면 안돼
		
		Scanner sc = new Scanner(System.in); 
		int count = 0; //사용자가몇 번해보나 세기
		while(true){
			System.out.println("3자리 숫자>"); //사용자한테 값받기
			int input = Integer.parseInt(sc.nextLine());
			int i3 = input % 10; //1의 자리
			input /= 10;
			int i2 = input % 10; //10의 자리
			input /= 10;
			int i1 = input; //100의 자리
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a1 == i2) ball++;
			
			out = 3 - strike - ball; //out의 개수는 3개에서 strike랑 ball 뺀 값
			
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : " + strike + "S " + ball + "b " + out + "O ");
			System.out.println("-------------------------------------------------------------");
			if(strike == 3){
				System.out.println("정답입니다!");
				break;
			}
		}
		
//		int a = (int)(Math.random() * 9) + 1;
//		int b = (int)(Math.random() * 9) + 1;
//		int c = (int)(Math.random() * 9) + 1;
//		
//		for(int i = 1; i < 10000; i++){
//			if(a != b && b != c && a != c){ //i가 1바퀴돌면서 if를 돌리는데 확률 상 10000번 이상을 돌려야 같은 수가 안 나오니까 
//				break;
//				}
////			else{
////			 a = (int)(Math.random() * 9) + 1;
////			 b = (int)(Math.random() * 9) + 1;
////			 c = (int)(Math.random() * 9) + 1;
////			}
//			
//			Scanner sc = new Scanner(System.in);
//			
//			int S = 0;
//			int B = 0; 
//			int O = 0;
//			do{
//				System.out.println("숫자 3개를 입력해주세요>");
//				S = Integer.parseInt(sc.nextLine());
//				B = Integer.parseInt(sc.nextLine());
//				O = Integer.parseInt(sc.nextLine());
//					if(S == a){
//						S++;
//					}
//					else if(B == b || B == c){
//						B++;
//					}
//					else {
//						O++;
//					}
//					if(B == b){
//						S++;
//					}
//					else if(B == a || B == c){
//						B++;
//					}
//					else{
//						O++;
//					}
//					if(O == c){
//						S++;
//					}
//					else if(O == a || O == b){
//						B++;
//					}
//					else{
//						O++;
//						break;
//					}
//			}
//					while(S != a || B != b || O != c);
//					
//					System.out.println(S + "," + B + "," + O + " : S : " + S + " : B : " + B + " : O : " + O);
//					System.out.println("다시 입력하세요>");
//		
//				System.out.println(a + "," + b + "," + c + " : " + "3S");
//		break;
//			}
		
		
		}
	}






