package com.declarations.method.differentpackage;

import com.declarations.method.Methoddeclaration;

public class DifferentPackageDifferentClass 
{
public static void main(String [] args) {
		
	Methoddeclaration object = new Methoddeclaration();
	Methoddeclaration diffObject = new Methoddeclaration();
		
		//These below are instance methods, To access or set the value of the method
		//First you must create a object using new operator and the constructor like above
		
		
		//Uncomment the next line to see the compilation error that the private method is not accessible outside of class
		//object.geta(); 
		
		//Uncomment the next line to see the compilation error that the default method is not accessible outside of Package
		//object.getb();
		
		//Uncomment the next line to see the compilation error that the protected method is not accessible outside of Package for non child class
		//object.getc();
		
		object.getd();  //Proof that public is accessible in different package and unrelated class.
		
		//For static we can directly access or set as given without creating Object.
		
		//Uncomment the next line to see the compilation error that the private static method is not accessible outside of class
		//Methoddeclaration.geta();
		
		//Uncomment the next line to see the compilation error that the default method is not accessible outside of Package
		//Methoddeclaration.getb();
		
		//Uncomment the next line to see the compilation error that the protected method is not accessible outside of Package for non child class
		//Methoddeclaration.getc();
		
		
		Methoddeclaration.gets();//Proof that public is accessible in different package and unrelated class.
		
		System.out.println("Trying to access the static methods set without Object"+Methoddeclaration.gets());

		//It is not a good practice to access a static method using the object, just showed for demonstration.
		System.out.println("Actually we did not set against the object, static is shared across objects and here is the proof = "+object.gets());
		System.out.println("Actually we did not set against the diffObject, static is shared across objects and here is the proof = "+diffObject.gets());
		
		
	}


}
