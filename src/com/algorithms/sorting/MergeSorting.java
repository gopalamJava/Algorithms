package com.algorithms.sorting;

import java.util.Random;

public class MergeSorting {

	public static void main(String[] args) {

		Random rd = new Random();

		int numbers[] = new int[10];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = rd.nextInt(100000);

		}

		printarraay(numbers, "before sorting ");

		mergesort(numbers);

		printarraay(numbers, "After sorting ");
	}

	private static void mergesort(int[] numbers) {
		
		int length=numbers.length;
		if(length <2) {
			return;
		}
		int mid = length /2;
		int lefthalf[]=new int[mid];
		int righthalf[]= new int[length-mid];
		
		//Storing/dividing elements in left half
		for (int i=0; i<mid; i++) {
			lefthalf[i]=numbers[i];
			
		}
		
		//storing/dividing elements in right half
		for (int i=mid; i<length; i++) {
			righthalf[i-mid]=numbers[i];
			
		}
		
		//recursive calls
		mergesort(lefthalf);
		mergesort(righthalf);
		
		//merging
		merge(lefthalf,righthalf, numbers);
	}
		
		private static void merge(int[] lefthalf, int[] righthalf, int[] result) {
			
			
			int l=0, r=0,rs=0;
			
			//comparing and merging
			while(l<lefthalf.length && r<righthalf.length) {
				
				if(lefthalf[l]>righthalf[r]) {
					result[rs]=lefthalf[l];
					l++;
					
					}
				else {
					result[rs]=righthalf[r];
					r++;
					}
				rs++;
				}
			//merging remaining elements
			while(l<lefthalf.length) {
				result[rs]=lefthalf[l];
				l++;
				rs++;
			}
			while(r<righthalf.length) {
				result[rs]=righthalf[r];
				r++;
				rs++;
			}
			
			
			
		
		
	}

	private static void printarraay(int[] numbers, String position) {
		System.out.println("numbers position " + position);
		for (int i : numbers) {
			System.out.println(+i);
		}
	}

}
