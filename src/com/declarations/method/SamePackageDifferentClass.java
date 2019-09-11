package com.declarations.method;

public class SamePackageDifferentClass 
{
public static void main(String [] args) {
		
		Methoddeclaration object = new Methoddeclaration();
		Methoddeclaration diffObject = new Methoddeclaration();
		
		//These below are instance methods, To access or set the value of the method
		//First you must create a object using new operator and the constructor like above
		
		
		//Uncomment the next line to see the compilation error that the private method is not accessible outside of class
		//object.geta(); 
		
		object.getb();  //Proof that default is accessible within same package.
		
		object.getc();  //Proof that protected is accessible within same package.
		
		object.getd();  //Proof that public is accessible within same package.
		
		//For static we can directly access or set as given without creating Object.
		
		//Uncomment the next line to see the compilation error that the private static method is not accessible outside of class
		//Methoddeclaration.getx();
		
		Methoddeclaration.gety();//Proof that default is accessible within same package.
		Methoddeclaration.getz();//Proof that protected is accessible within same package.
		Methoddeclaration.gets();//Proof that public is accessible within same package.
		
		System.out.println("Trying to access the static methods set without Object"+Methoddeclaration.gety());

		//It is not a good practice to access a static methods using the object, just showed for demonstration.
		System.out.println("Actually we did not set against the object, static is shared across objects and here is the proof = "+object.getz());
		System.out.println("Actually we did not set against the diffObject, static is shared across objects and here is the proof = "+diffObject.getz());
		
		
	}

}
