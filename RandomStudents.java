package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//302호 학생들 중 입력받은 수만큼 랜덤으로 학생을 뽑는 프로그램을 만들어주세용
		String[] students = new String []{"강인혜", "권현지", "김건욱", "김건웅", "김동욱", "김민현", "김진훈", "박경미", "소혜원", "송영관", "여은정", "윤경식", "이민재", "이용희", "이원균", "이전은", "이한규", "임정선", "장제원", "전희", "정경민", "조원혜", "최무선"} ;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("몇 명뽑을까요?>");
		int count = Integer.parseInt(sc.nextLine()); //숫자만큼 count변수에 저장됨
			
			String[] pick = new String[count]; //count변수크기만큼(몇칸) 배열을 저장 
			int pickCount = 0; //지금까지 몇 명 뽑았는지 세려고 중복되지 않을 때마다 증가됨
			do{
				int random = (int)(Math.random() * students.length); //랜덤발생시켜 do!!!!!
				
				boolean flag = true;
				for(int i = 0; i < pick.length; i++){  //for문을 통해서돌면서
					if(students[random].equals(pick[i])){ //pick[i]배열 몇 개 생겼나랑 students[random]이름들 25개 막 도는 거랑 중복여부 확인
						flag = false; //위의 값이 일치하면 중복된거지 이름들도 맨 위에{배열의 순서}가 있었잖아.
 					}
				}
				if(flag){ //트루로 쭉 내려오면(위의 students[random].equals(pick[i])가 같지 않다는거지) 중복된 값이 없다는 거야. 추가된다는거야
					pick[pickCount++] = students[random]; //또는[]에서 ++없애고 pickcount++; 
				}
			}while(pickCount < count); //몇 번을 해야 중복이 안되는지 모르니까 while을 돌려주는거야 뽑은 다음(do)에 검사하려고. 뽑을 사람이 뽑아야할 사람보다 적을 때만 실행
			
			System.out.println(Arrays.toString(pick));

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//			for(int i = 0; i < x; i++){
//				 String random = "" + (Math.random() * pick.length);
//					
//			}
//			System.out.println(Arrays.toString(pick));
			
	}

}
