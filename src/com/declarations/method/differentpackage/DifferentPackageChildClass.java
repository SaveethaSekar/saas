package com.declarations.method.differentpackage;

import com.declarations.method.Methoddeclaration;

public class DifferentPackageChildClass extends Methoddeclaration
{

	//Also note since Methoddeclaration is in a different package we need to import the class first in the line number 3

	/*
	 * Please note we did not add any new methods to this class
	 * basically we inherited the methods
	 * But we can see the private and default method of the parent class is not accessible in this class
	 * whereas protected and public methods are accessible.
	 */
	
	public static void main(String [] args) {
		
		DifferentPackageChildClass object = new DifferentPackageChildClass();
		DifferentPackageChildClass diffObject = new DifferentPackageChildClass();
		
		//These below are instance methods, To access or set the value of the method
		//First you must create a object using new operator and the constructor like above
		
		
		//Uncomment the next line to see the compilation error that the private method is not accessible outside of class
		//object.geta(); 
		
		//Uncomment the next line to see the compilation error that the default method is not accessible outside of Package
		//object.getb();
		
		object.getc();  //Proof that protected is accessible with child class in different package.
		
		object.getd();  //Proof that public is accessible with child class in different package.
		
		//For static we can directly access or set as given without creating Object.
		
		//Uncomment the next line to see the compilation error that the private static method is not accessible outside of class
		//DifferentPackageChildClass.getx();
		
		//Uncomment the next line to see the compilation error that the default method is not accessible outside of Package
		//DifferentPackageChildClass.gety();
		
		
		DifferentPackageChildClass.getz();//Proof that protected is accessible with child class in different package.
		
		DifferentPackageChildClass.gets();//Proof that public is accessible with child class in different package.
		
		System.out.println("Trying to access the static variables set without Object"+Methoddeclaration.getz());

		//It is not a good practice to access a static variable using the object, just showed for demonstration.
		System.out.println("Actually we did not set against the object, static is shared across objects and here is the proof = "+object.gets());
		System.out.println("Actually we did not set against the diffObject, static is shared across objects and here is the proof = "+diffObject.gets());
		
		
	}


}
