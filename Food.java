package f_game;

public class Food {
 
 String name; 
 int weight; 
 
 Food(String name, int weight){
 this.name = name;
 this.weight = weight;
 }
 
 String  foodInfo(){
  String info = name + " : ";
  if(0 < weight) info += "몸무게+ " + weight;
  return info;
 }

}
 