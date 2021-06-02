package f_game;

public class Apeach {
 String name;  
 int maxWeight;  
 int weight;   
 int level; 
 Food[] foods;  
 
 Apeach(String name, int weight){
  this.name = name;
  this.weight = 0;
  this.maxWeight = weight;
  this.level = 1;
  this.foods = new Food[10];
  //this.foods = new Food[]{new Food("밥", 5),new Food("라면", 5)};
 }
 
 void ApeachInfo(){
  System.out.println("==============================");
  System.out.println("-------------내 정보-------------");
  System.out.println("이름 : " + name);
  System.out.println("레벨 : " + level);
  System.out.println("몸무게 : " + this.weight + "/" + maxWeight);
  System.out.println("--------------냉장고--------------");
  for(int i = 0; i < foods.length; i++){
   if(foods[i] != null){
    System.out.println(foods[i].foodInfo());
   }
  }
  //System.out.println(getFood);
  System.out.println("==============================");
 }

 void getWeight(int weight){
	 this.weight += weight;
	 while(this.maxWeight <= this.weight){
		 levelUp();
		 this.weight -= 10;
	 }
 }
 void levelUp(){
	   level++;
	   maxWeight += 10;
	   System.out.println("Level up~~살이 ٩(     ｡•ㅅ•｡            )و 쪘어요~~up!!!!!");
	 }
 
// void loseWeight(int weight){ //
//	 weight -= this.weight;
//	 while(0 > weight){
//		 weight = 0;
//	 }
// }
//  void levelDown(int weight) {
//	level--;
//	System.out.println("레벨다운");
//}

  void getFood(Food food){
   System.out.println(food.name + " 을/를 획득했어요!! 냉장고에 넣어요");
   System.out.println();
   for(int i = 0; i < foods.length; i++){
    if(foods[i] == null){
     foods[i] = food;
     break;
     }
   }
  // weight += food.weight;
  
  }
}
