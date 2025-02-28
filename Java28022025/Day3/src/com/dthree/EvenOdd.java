package com.dthree;

public class EvenOdd {
	public static void main(String[] args) {
		int[] a = {10,11,12,13,14,15,16,17,18,19,20};
		int start = 0;
		int end = a.length-1;
		int temp = 0;
		
		int x = start;
		int y = end;
		
		System.out.println("Array before reversal\n");
		int i = 0;
		while(i<=end) {
			System.out.println(a[i]+"\t");
			i++;
		}
		
		while(start<=end) {
			if(a[start]%2==0 && a[end]%2!=0) {	//even odd
				start++;
				end--;
			}
			else if(a[start]%2==0 && a[end]%2==0) {	//even even
				start++;
			}
			else if(a[start]%2!=0 && a[end]%2==0) {
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			else {
				end--;
			}
		}
		System.out.println("Array after program\n");
		int j = 0;
		while(j<=y) {
			System.out.println(a[j]+"\t");
			j++;
		}
	}
}
