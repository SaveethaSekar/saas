package com.declarations.method;

public class SamePackageChildClass extends Methoddeclaration
{
	/*
	 * Please note we did not add any new method to this class
	 * basically we inherited the methods
	 * But we can see the private method of the parent class is not accessible in this class
	 * whereas default, protected and public method are accessible.
	 */
	public static void main(String [] args) {
		
		SamePackageChildClass object = new SamePackageChildClass();
		SamePackageChildClass diffObject = new SamePackageChildClass();
		
		//These below are instance methods, To access or set the value of the method
		//First you must create a object using new operator and the constructor like above
		
		
		//Uncomment the next line to see the compilation error that the private method is not accessible outside of class
		//object.geta(); 
		
		object.getb();  //Proof that default is accessible with child class in same package.
		
		object.getc();  //Proof that protected is accessible with child class in same package.
		
		object.getd();  //Proof that public is accessible with child class in same package.
		
		//For static we can directly access or set as given without creating Object.
		
		//Uncomment the next line to see the compilation error that the private static method is not accessible outside of class
		//SamePackageChildClass.getx();
		
		SamePackageChildClass.gety();//Proof that default is accessible with child class in same package.
		SamePackageChildClass.getz();//Proof that public is accessible with child class in same package.
		SamePackageChildClass.gets();//Proof that public is accessible with child class in same package.
		
		System.out.println("Trying to access the static methods set without Object"+Methoddeclaration.gety());

		//It is not a good practice to access a static method using the object, just showed for demonstration.
		System.out.println("Actually we did not set against the object, static is shared across objects and here is the proof = "+object.getz());
		System.out.println("Actually we did not set against the diffObject, static is shared across objects and here is the proof = "+diffObject.getz());
		
		
	}

	
	
}
