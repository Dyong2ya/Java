package f_game;

import e_oop.ScanUtil;

public class Jayz {

 String name;  		
 int maxWeight;  	
 int weight;   		
 Food[] foods; 	  
 
 Jayz(String name, int maxWeight, Food[] foods){
  this.name = name;
  this.maxWeight = weight;
  this.weight = this.maxWeight;
  this.foods = foods;
 }
 void getWeight(int weight){//
	 this.weight += weight;//
	
	 }
 
 void getFood(Food food){
	   System.out.println(food.name + " 을/를 잃었어요ㅜㅜ");//
	   System.out.println();
	   for(int i = 0; i < foods.length; i++){
	    if(foods[i] == null){
	     foods[i] = food;
	     break;
	     }
	   }
	   weight += food.weight; //
	   
	  }
	   Food foodDrop(){
			return foods[(int)(Math.random() * foods.length)];


	  }
	}