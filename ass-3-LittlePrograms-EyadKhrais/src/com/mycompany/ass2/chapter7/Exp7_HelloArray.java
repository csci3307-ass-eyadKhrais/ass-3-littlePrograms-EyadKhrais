package com.mycompany.ass2.chapter7;

import java.util.Arrays;

public class Exp7_HelloArray {

	private String name;
	public Exp7_HelloArray(String _name) {
		name = _name;
	}
	@Override
	public String toString() {
		return "name:" + name;
	}


public static void main(String[] args) {
	int[] intArray1;
	int   intArray2[];

	
	intArray1 = new int[3];		
	intArray2 = new int[10];	
	
	int[] intArray3 = new int[5];
	
	intArray1[0] = 101;
	intArray1[1] = 102;
	intArray1[2] = 103;
	//
	for (int i = 0; i < 10; i++) {
		intArray2[i] = 201 + i;
	}
	
	Float[] floatArray = {301f, 302f, 303f, 304f, 305f};

	int[] 		intArray4 = {401,402};
	Integer 	integerArray[];
	Exp7_HelloArray[] someClassArray = {new Exp7_HelloArray("one"), new Exp7_HelloArray("two")};
	
	System.out.println("intArray1 print the memory address:" + intArray1);						
	System.out.println("intArray1 print via Arrays.toString:" + Arrays.toString(intArray1));	
	System.out.println("floatArray print via Arrays.toString:" + Arrays.toString(floatArray));	
	System.out.println("someClassArray via Arrays.toString:" + Arrays.toString(someClassArray));
	
	System.out.println("3rd element of floatArray at index 2 is:" + floatArray[2]);	
	
	String[] names = {"ilker", "john"};
	System.out.println("BEFORE names:" + Arrays.toString(names));	
	strArrayPassedByReference(names);
	System.out.println("AFTER names:" + Arrays.toString(names));	
	

	System.out.println("BEFORE names:" + Arrays.toString(names));	
	strArrayPassedByReference_WRONG(names);
	System.out.println("AFTER names still same as before:" + Arrays.toString(names));	
	
	
	int twoDimensionalIntArray[][] = new int[2][3];
	twoDimensionalIntArray[0] = new int[3];
	twoDimensionalIntArray[0][0] = 10;
	twoDimensionalIntArray[0][1] = 20;
	twoDimensionalIntArray[0][2] = 30;
	int[] intArray5 = {100,200,300};
	twoDimensionalIntArray[1] = intArray5;
	System.out.println("twoDimensionalIntArray is " + Arrays.deepToString(twoDimensionalIntArray));	// NOTE using "Arrays.deepToString" for multi dimensional array. Prints [[10, 20, 30], [100, 200, 300]]

	String[] spanishNumbers = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
	for (String spanishNumber : spanishNumbers) {
		System.out.println("spanishNumber:" + spanishNumber);
	}
	
	double averageOfNumbers = average(1, 2, 3, 4, 5);
	System.out.println("averageOfNumbers:" + averageOfNumbers);
	}

		private static void strArrayPassedByReference(String[] _names) {
			for (int i = 0; i < _names.length; i++) {
				_names[i] += "MR";
		}
		}

		private static void strArrayPassedByReference_WRONG(String[] _names) {
			_names = new String[_names.length];
			for (int i = 0; i < _names.length; i++) {
				_names[i] += "DR";
			}
		}


		public static double average(double ... numbers) {
			double total = 0d;
	
			for (double number : numbers) {
				total += number;
			}
	
			return total / numbers.length;
		}
	}
