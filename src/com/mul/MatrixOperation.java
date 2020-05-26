package com.mul;
import java.util.*;

public class MatrixOperation
{
	public static void main(String[] args) 
	{
		int r1,r2,c1,c2,i,j,k,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows of mat1");
		r1=s.nextInt();
		System.out.println("Enter the no of columns of mat1");
		c1=s.nextInt();
		System.out.println("Enter the no of rows of mat2");
		r2=s.nextInt();
		System.out.println("Enter the no of columns of mat2");
		c2=s.nextInt();
		if(c1==r2)
		{
			int mat1[][]=new int[r1][c1];
			int mat2[][]=new int[r2][c2];
			int res[][]=new int[r1][c2];
		System.out.println("Enter the elements of mat1");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				mat1[i][j]=s.nextInt();
		
		}
			}
		System.out.println("Enter the elements of mat2");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				mat2[i][j]=s.nextInt();
			}}
		System.out.println("output matrix:");
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				sum=0;
				for(k=0;k<r2;k++) {
					sum+=mat1[i][k]*mat2[k][j];
				}
				res[i][j]=sum;
			}}
			for(i=0;i<r1;i++) 
			{
			for(j=0;j<c2;j++) {
				System.out.println(res[i][j]+" ");
				System.out.println();
			}
			}
		}
			
		else
			System.out.println("multiplication does not exist");

	}
	}

