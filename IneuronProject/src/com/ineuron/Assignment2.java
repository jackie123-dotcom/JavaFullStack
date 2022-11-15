package com.ineuron;

import java.util.HashSet;
import java.util.Set;

class AlgorithmTrial{
	
	public static void findDups() {
		
		 //Question 1
		  //Method 1
		
		int [] arr = {10, 13, 20, 24, 10, 12, 13, 20};
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate numbers are: " + arr[i]);
				}
			}
		}
	}
	   //Method 2
	public static void findDups2() {
		int [] arr = {10, 13, 20, 24, 10, 12, 13, 20};
		
		Set<Integer> dups = new HashSet<>();
		
		for(Integer num : arr) {
			
			if(!dups.add(num)) {
				System.out.println("Duplicates are: "+ num);
			}
		}
	}
	     //Question 4
	
	public static void merge() {
		int nums[] = {2, 9, 0, 4, 1};
		
		mergeSort(nums);
		
		System.out.println(); 
		
		for(int i: nums)  {
			System.out.print(i + ", ");
		}
		
		int [] num = {2, 7, 1, 6, 3, 4, 0, -15};
		
		mergeSort(num);
		System.out.println();
		
		for(int i : num) {
			System.out.print(i + ", ");
		}
		

	}
	
	public static void mergeSort(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
	}
	
	// 0,1,2,3,4,5,6
	// l = 0, m = (0 + 6)/2 = 3
	// m = 3
	// r = 6
	private static void mergeSort(int[] nums, int l, int r) {
		if(l >= r) 
			return;
		
		int m = l + (r - l)/2;
		mergeSort(nums, l, m);
		mergeSort(nums, m + 1, r);
		merge(nums, l, m, r);
	}


	private static void merge(int[] nums, int l, int m, int r) {
		int[] A = new int[m - l + 1];
		int[] B = new int[r - m];
		
		for(int i = 0, j = l; i < A.length; i++, j++) {
			A[i] = nums[j];
		}
		
		for(int i = 0, j = m + 1; i < B.length; i++, j++) {
			B[i] = nums[j];
		}
		
		int i = 0;
		int j = 0;
		int index = l;
		
		while(i < A.length && j < B.length) {
			if(A[i] < B[j]) {
				nums[index++] = A[i++];
			} else {
				nums[index++] = B[j++];
			}
		}
		
		while(i < A.length) {
			nums[index++] = A[i++];
		}
		
		while(j < B.length) {
			nums[index++] = B[j++];
		}
	}
	    //Question 3
	public static void quickSort() {
		int [] num = {2, 7, 1, 6, 3, 4, 0, -15};
		
	}
}


public class Assignment2 {
	
	public static void main(String[] args) {
		
		AlgorithmTrial.findDups();
		System.out.println();
		AlgorithmTrial.findDups2();
		System.out.println();
		AlgorithmTrial.merge();
	}
		
}


