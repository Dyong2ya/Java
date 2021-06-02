package f_game;

import e_oop.ScanUtil;


public class ApeachGame {
  
  //게임에 등장하는 것들 초기화해줘
  Apeach a;
  Jayz j;
  Food[] foods;
  
  ApeachGame(){
   a = new Apeach("어피치", 10, 0);
   
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
    	System.out.println(j.name + "(°᷄д°᷅)가 퀴즈를 낼거야");
    	
    	int input = 0;
		Quiz : while(true){
			System.out.println("1.퀴즈\t2.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1: 
				System.out.println("ᕕ(ꐦ°᷄д°᷅)ᕗ   -> \"1,2 중 내가 생각하는 하나를 골라봐. 맞추면 음식을 줄거야. 맞추지 못 하면 -5만큼 배가 고프게 할 거야.\"");
				int num = (int)(Math.random() * 2) + 1;
				input = ScanUtil.nextInt();
				if(num == input){
					System.out.println("어피치가 이겼다>.<");
					Food fff = j.foodDrop();
					a.getFood(fff);
					a.getWeight(fff.weight);
				}
				else if(num != input){
					System.out.println("어피치가 졌다");
					if(a.weight <= 0){
						System.out.println("어피치가 배가 고파서 게임을 진행할 수 없어요ㅠ.ㅠ  제이지를 이겨 냉장고를 채워요"); 
						System.out.println();
					}else if(a.weight > 0){
							a.loseWeight(5);
						    a.count();
						}
						break Quiz;
					}
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
      
     
    

     
    
 
   
