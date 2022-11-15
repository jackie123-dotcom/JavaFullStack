package com.ineuron;

import java.util.*;

public class QuickSortAlgorithm {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int [] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(50);
		}
		
		System.out.println("Before");
		 printArray(nums);
		 
		 quicksort(nums, 0, nums.length-1);
		 
		 System.out.println("\nAfter");
		 printArray(nums);
		 
	}
	            //QUICKSORT
	private static void quicksort(int [] arr, int lowIndex, int highIndex) {
		
		if(lowIndex >= highIndex) {
			return;
		}
		int pivot = arr[highIndex];
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			
			while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(arr, leftPointer, rightPointer);
		}
		
		swap(arr, leftPointer, highIndex);
		
		quicksort(arr, lowIndex, leftPointer-1);
		
		quicksort(arr, leftPointer + 1, highIndex);
	}
	
	private static void printArray(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
	}
	
	private static void swap(int []arr, int index1, int index2) {
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}

}
