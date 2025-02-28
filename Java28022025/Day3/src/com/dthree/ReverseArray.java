package com.dthree;

public class ReverseArray{
	
	public static void main(String[] args) {
		int[] a = {15,24,32,98,57,48,02,36,98};
		int start = 0;
		int end = a.length-1;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int temp = 0;
		
		System.out.println("Array before reversal\n");
		int i = 0;
		while(i<=end) {
			System.out.println(a[i]+"\t");
			i++;
		}
		
		int x = start;
		int y = end;
		
		while(start<=end) {
			if(a[start]>max) {
				max = a[start];
			}
			else if(a[start]<min) {
				min = a[start];
			}
			if(a[end]>max) {
				max = a[end];
			}
			else if(a[end]<min) {
				min = a[end];
			}
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		
//		System.out.println(x+" "+y);
		
		System.out.println("Array after reversal\n");
		int j = 0;
		while(j<=y) {
			System.out.println(a[j]+"\t");
			j++;
		}
		
		System.out.println("Max Value is : "+max);
		System.out.println("Min Value is : "+min);
	}
}