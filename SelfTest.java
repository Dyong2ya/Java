package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("..............탄수화물 중독 자가진단 테스트...............");
		System.out.println("--------------------------------------------------");
		System.out.println("                                                 ");
		System.out.println("문항을 읽고 맞으면 o, 틀리면 x를 눌러주세요.");
		System.out.println("                                                 ");
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("1. 아침을 배불리 먹은 후 점심시간 전에 배가 고프다>");
		String a = sc.nextLine();
		if(a.equalsIgnoreCase("o")){	
			sum ++;
		}
		else if(a.equals("x")){
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("2. 밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다>");
		String b = sc.nextLine();
		if(b.equals("o")){	
			sum ++;
		}
		else if(b.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("3. 음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다>");
		String c = sc.nextLine();
		if(c.equals("o")){	
			sum ++;
		}
		else if(c.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("4. 정말 배고프지 않더라고 먹을 때가 있다>");
		String d = sc.nextLine();
		if(d.equals("o")){	
			sum ++;
		}
		else if(d.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("5. 저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다>");
		String e = sc.nextLine();
		if(e.equals("o")){	
			sum ++;
		}
		else if(e.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("6.스트레스를 받으면 자꾸 먹고 싶어진다>");
		String f = sc.nextLine();
		if(f.equals("o")){	
			sum ++;
		}
		else if(f.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("7. 책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다>");
		String g = sc.nextLine();
		if(g.equals("o")){	
			sum ++;
		}
		else if(g.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("8. 오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다>");
		String h = sc.nextLine();
		if(h.equals("o")){	
			sum ++;
	    }
		else if(h.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("9. 과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다>");
		String i = sc.nextLine();
		if(i.equals("o")){	
			sum ++;
		}
		else if(i.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("10. 다이어트를 위해 식이조절을 하는데 3일도 못 간다>");
		String j = sc.nextLine();
		if(j.equals("o")){	
			sum ++;
		}
		else if(j.equals("x")){	
		}
		else{
			System.out.println("o와 x만 누르세요");
		}
		System.out.println("                                                 ");
		System.out.println("<체크된 항목의 개수>" + sum);
		System.out.println("--------------------------------------------------------------");
		System.out.println("<<검사결과>>");
		
		if(sum == 3){
			System.out.println("주의! 위험한 수준은 아니지만 관리 필요");
		}
		else if(4 <= sum && 6 >= sum){
			System.out.println("위험! 탄수화물 섭취를 줄이기 위한 식습관 개선이 필요함");
		}
		else if(7 <= sum && 10 >= sum){
			System.out.println("중독! 전문의 상담이 필요함");
		}
		else{
		}
		
		
	}
}


	

