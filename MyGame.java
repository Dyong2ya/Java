package f_game;

import e_oop.ScanUtil;

public class MyGame {

	//게임에 등장하는 것들을 변수로 설정 
			Character c;
			Item[] items;
			
			MyGame(){
				c = new Character("가렌", 100, 50, 20, 10);
				
				items = new Item[10];
				items[0] = new Item("무한의 대검", 0, 0, 10, 0);
				items[1] = new Item("가시갑옷", 0, 0, 0, 10);
			}
			
	public static void main(String[] args) {
		//게임이 진행되는 거 메인은 static이 붙어있어서 객체생성 자주 해줘야돼
		new MyGame().start(); //그래서 객체를 생성하고 스타트 메서드
	}
	
	void start(){ //스태이틱 없어서 사용하기 편해
		int input = 0;
		while(true){
			System.out.println("1.내 정보\t2.사냥\t3.종료");
			input = ScanUtil.nextInt();
			
			switch (input){
			case 1:
				c.showInfo(); 
				break;
			case 2: //사냥
				hunt(); //밑에 메서드 만들고 호출할래
				break;
			case 3:
				System.out.println("종료되었습니다");
				System.exit(0);
				break;
			}
		}

	}
	
	void hunt(){ //이 메서드에서 사냥할거야 사냥을 할  때마다 몬스ㅓ 한마리씩 생성
		Monster m = new Monster("고블린", 20, 10, 15, 10, new Item[]{items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1: //공격 
				c.attack(m); //내가 먼저 공격하고
				if(m.hp <= 0){ //죽어야지
					System.out.println(m.name + "을 처치했습니다");
					c.getExp(150);
					c.getItem(m.itemDrop());
					break battle; //몬스터 뒤졌으면 게임 종료지
				}
				m.attack(c); //그 다음 몬스터 공격하고
				break;
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다");
				break battle; //while문 빠져나가는 브레이크
			}
		}
	}

}
