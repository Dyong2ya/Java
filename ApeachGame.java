package f_game;

import e_oop.ScanUtil;


public class ApeachGame {
  
  //게임에 등장하는 것들 초기화해줘
  Apeach a;
  Jayz j;
  Food[] foods;
  
  ApeachGame(){
   a = new Apeach("어피치", 10);
   
   foods = new Food[10];
   foods[0] = new Food("\"백순대볶음\"",5);
   foods[1] = new Food("\"티라미슈\"",5);
   foods[2] = new Food("\"짬뽕\"",5);
   foods[3] = new Food("\"루꼴라피자\"",5);
   foods[4] = new Food("\"떡볶이\"",5);
   foods[5] = new Food("\"삼각김밥\"",5);
   foods[6] = new Food("\"크로플\"",5);
   foods[7] = new Food("\"오뎅탕\"",5);
   foods[8] = new Food("\"햄버거\"",5);
   foods[9] = new Food("\"레몬마들렌\"",5);
  }
   
   public static void main(String[] args) { 
    new ApeachGame().start();
   }
   
    void start(){
     int input = 0;
     while(true){
      System.out.println("1.어피치(｡•ㅅ•｡)정보\t2.퀴즈\t3.게임끝!");
      input = ScanUtil.nextInt();
      
      switch (input){
		case 1:
			a.ApeachInfo(); 
			break;
		case 2: 
			Quiz(); //밑에 메서드 만들고 호출할래
			break;
		case 3:
			System.out.println("게임끝!");
			System.exit(0);
			break;
      	}
     }
  }
     void Quiz(){
    	Jayz j = new Jayz ("제이지", 10, foods);
    	System.out.println(j.name + "ᕕ(ꐦ°᷄д°᷅)ᕗ가 퀴즈를 낼거야");
    	
    	int input = 0;
		Quiz : while(true){
			System.out.println("1.퀴즈\t2.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1: 
				System.out.println("제이지 says \"1,2 중 하나를 골라봐\"");
				int num = (int)(Math.random() * 2) + 1;
				input = ScanUtil.nextInt();
				if(num == input){
					System.out.println("제이지가 졌다");
					a.getWeight(0);
					a.getFood(j.foodDrop());
				}
				else if(num != input){
					System.out.println("어피치가 졌다");
					//a.loseWeight(5);
					//j.getFood(a.foodDrop());
				}
				else{
				}break Quiz;
				
			case 2: 
				System.out.println("한 판만 해봐yo!");
				System.out.println();
				break Quiz;
			}
				
			}
			
		}
     }
      
     
    

     
    
 
   