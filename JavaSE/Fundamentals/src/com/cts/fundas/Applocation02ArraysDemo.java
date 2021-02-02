package com.cts.fundas;

public class Applocation02ArraysDemo {

	public static void main(String[] args) {
	
		int arr1[]=new int[] {1,2,3,4,5,6,6};
		String arr2[]=new String[] {"APPLE","BABY","CAT"};
		
		int arr3[] = new int[20];
		
		int x=10;
		
		int arr4[] = new int[x];
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("----------------------------------------");
		for(int n:arr1) {
			System.out.println(n);
		}
		System.out.println("----------------------------------------");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("----------------------------------------");
		for(String s:arr2) {
			System.out.println(s);
		}	
		
		int[] a1 = new int[10]; //linear arrays
		int[][] a2 = new int[5][2]; //two-dimensional arrays
		int[][][] a3 = new int[5][2][2]; //three-dimensional arrays
		
		//jagged arrays.		
		int[][] aj1 = new int[5][];
		
		aj1[0] = new int[3];
		aj1[1] = new int[2];
		aj1[2] = new int[4];
		aj1[3] = new int[0];
		aj1[4] = new int[10];
		
		
	}
}
