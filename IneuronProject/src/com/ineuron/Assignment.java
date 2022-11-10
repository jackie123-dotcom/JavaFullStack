package com.ineuron;

public class Assignment {

	public static void main(String[] args) { 
		
		int r =10;    //Letter i      Question 1
		 
		 for(int i = 1; i <= r; i++) {
			 
			 for(int j =1; j <= r; j++) {
				 
				 if(((i==1||i==r)&&j%2==1)||j==r/2) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			    System.out.print(" ");
			    System.out.print(" ");
			    
			 for(int j =1; j<= r; j++) {
				 
				 if(j==1||j==r||j==i) {
					 
	    			 System.out.print("*");
	    		 }
	    		 else
	    			 System.out.print(" ");
	    	 }
			 System.out.print(" ");
			 System.out.print(" ");
			 
              for(int j = 1; j <= r; j++) {
				 
				   if(j==1||i==1||i==r/2||i==r) {
					 
					 System.out.print("*");
				 }
				 
				 else {
					 System.out.print(" ");
				 }
				  
			 }
              System.out.print(" ");
              System.out.print(" ");
              
              for(int j =1; j<=r; j++) {
 				 
 				 if((j==1||j==r)&&i<r-1||i == r-1 &&j%2 == 0)
 					 System.out.print("*");
 				 
 				 else
 					 System.out.print(" ");
 			 }
              System.out.print(" ");
              System.out.print(" ");
              
              int numb = 2;
     		 boolean fl = false;
     		 
              for(int j = 0; j<=r; j++) {
 				 
 				 if(j==1||(i==1||i==r/2)&&j%2==1||j==r&&i<r/2&&i!=1||i>=j) {
 					 
 					 System.out.print("*");
 				 }
 				 else if(i >r/2 &&j == numb) {
 					 
 					 System.out.print("*");
 					 
 					 fl = true;
 				 }
 				 else {
 					 System.out.print(" ");
 				 }
 				if(fl == true) {
	 				 numb++;
	 			 }
 	 			
 	 		}
              System.out.print(" ");
              System.out.print(" ");
              
              for(int j =1; j<=r; j++) {
  				 
  				 if((j==1||j==r)&&i<r-1||i == r-1 &&j%2 == 0)
  					 System.out.print("*");
  				 
  				 else
  					 System.out.print(" ");
  			 }
               System.out.print(" ");
               System.out.print(" ");
               
              
              for(int j =1; j<=r;j++) {
 	    		 
 	    		 if(j==1||j==r||j==i) {
 	    			 System.out.print("*");
 	    		 }
 	    		 else
 	    			 System.out.print(" ");
 	    	 }
 	    	 System.out.println();
 			 }
 			 System.out.println();
   
		int b = 18;      //Question 4
		
		for(int i =0; i<b; i++) {
			
			for(int j=0; j<b; j++) {
				
				if((i==b-1||i==b-2)||j==0&&i>(b-1)/2||j==b-1&&i>b-1/2||(i-j>=(b-1)/2)||i+j>=(b-1+(b-1)/2)) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		   System.out.println();
		
		
		int n = 4;    //Question 2
		
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}
		    System.out.println();
		
		int y=18;    //Question 3
		
	     for(int i=0; i<y; i++) {
	    	 
	    	 for(int j =0; j<y; j++) {
	    		 
	    		 if(i==0 ||j==0||i==y-1||j==y-1||i+j<=y/2||j-i>=y/2) {
	    			 System.out.print("*");
	    			 
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
	         System.out.println();
	         System.out.println("============================");
		      	      
		 int m = 14;     //Question 5
		 
		 for(int i = 0; i < m; i++) {
			 
			 for(int j = 0; j < m; j++) {
				 
				 if((i==0||j==0||i==m-1||j==m-1||i+j<=m/2||i-j>=m/2)){
						 
					 
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		 System.out.println();    
	}

}
