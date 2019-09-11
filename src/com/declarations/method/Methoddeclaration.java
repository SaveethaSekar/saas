package com.declarations.method;

public class Methoddeclaration 
{
		int a,b,c,d;
		static int x,y,z,s;//variable declaration
		//This is accessible only in this class, No where else
		private int geta()
		{
		return a;
		}
		//This is accessible only in the class and within package
		int getb()
		{
		return b;
		}
		//This is accessible only in the class and within package and any inherited classes	
		protected int getc()
		{
		return c;	
		}
		//This is accessible in the class and package and any inherited classes	
		public int getd()
		{
		return d;
		}
			
		//This static is accessible only in this class, No where else
		private static int getx()
		{
			return x=5;
		}

		//This static is accessible only in the class and within package
		static int gety()
		{
			return y=9;
		}

		//This static is accessible only in the class and within package and any inherited classes	
		protected static int getz()
		{
			return z=8;
		}

		//This static is accessible in the class and package and any inherited classes	
		public static int gets()
		{
			return s=3;
		}
		public static void main(String [] args)
		{

			Methoddeclaration object = new Methoddeclaration();
			Methoddeclaration diffObject = new Methoddeclaration();
			//These below are instance methods, To access or set the value of the method
			//First you must create a object using new operator and the constructor like above

			object.geta(); //Proof that the private method is accessible

			object.getb(); //Proof that default method is accessible within class.

			object.getc();  //Proof that protected method is accessible within class.

			object.getd();  //Proof that public method is accessible within class.

			//For static we can directly access or set as given without creating Object.

			Methoddeclaration.getx();
			Methoddeclaration.gety();
			Methoddeclaration.getz();
			Methoddeclaration.gets();

			System.out.println("Trying to access the static methods set without Object"+Methoddeclaration.getx());
		
			//It is not a good practice to access a static method using the object, just showed for demonstration.
			System.out.println("Actually we did not set against the object, static is shared across objects and here is the proof = "+object.getx());
			System.out.println("Actually we did not set against the diffObject, static is shared across objects and here is the proof = "+diffObject.getx());


		}
}
