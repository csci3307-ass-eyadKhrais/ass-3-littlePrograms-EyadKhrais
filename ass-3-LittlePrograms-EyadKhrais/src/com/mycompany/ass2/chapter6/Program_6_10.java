package com.mycompany.ass2.chapter6;

public class Program_6_10 {
	
	  public static void main(String[] args) {
		  
	  System.out.println(roundToInteger(5.6222));
	  System.out.println(roundToTenths(5.6222));
	  System.out.println(roundToHundreths(5.6222));
	  System.out.println(roundToThousandths(5.6222));

	  }
	  static double roundToInteger(double num){
		   return Math.floor(num * 1 + 0.5) / 1;
	   }
	  static double roundToTenths(double num){
		   return Math.floor(num * 10 + 0.5) / 10;
	   }
	  static double roundToHundreths(double num){
		   return Math.floor(num * 100 + 0.5) / 100;
	   }
	  static double roundToThousandths(double num){
		   return Math.floor(num * 1000 + 0.5) / 1000;
	   }

}
