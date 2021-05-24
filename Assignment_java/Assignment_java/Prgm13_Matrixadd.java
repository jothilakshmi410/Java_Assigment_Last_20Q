package com.anna.cs;

public class Prgm13_Matrixadd {
	 
		public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,5,6},{4,4,3},{1,5,5}};    
		int b[][]={{1,2,5},{1,1,1},{1,2,5}};    
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}}  


