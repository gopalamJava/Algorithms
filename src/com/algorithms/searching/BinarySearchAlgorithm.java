package com.algorithms.searching;

import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter key");
		int[] sortedArray = { 2, 3, 4, 5, 6, 7, 8, 89 };
		int x = sc.nextInt();
		Integer result = searchForKey(sortedArray, x, 0, 8);
		System.out.println(" position of given key in an array: " + result + 1);

	}

	private static int searchForKey(int[] sortedArray, int x, int l, int h) {

		if (l > h) {
			return -1;
		}
		int mid = (l + h) / 2;
		if (sortedArray[mid] == x)
			return mid;
		else if (x > sortedArray[mid]) {
			return searchForKey(sortedArray, x, mid + 1, h);
		} else {
			return searchForKey(sortedArray, x, l, mid - 1);
		}

	}

}
