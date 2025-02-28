package com.dthree;

import java.util.Arrays;
import java.util.Collections;

public class DupliCount {
	
	public static void main(String[] args) {
		Integer[] array = {1,2,3,3,4,5,5,5,6,7,8,8,8,8,9,10};
		Arrays.sort(array);
		int maxVal = Collections.max(Arrays.asList(array));
		int[] hash = {};
		
		for(int i = 0; i<=(array.length)-2; i++) {
			if(array[i]==array[i+1]) {
				hash[array[i]] ++;
			}
		}
		for(int j = 0; j<=maxVal; j++) {
			if(hash[j]>=1) {
				System.out.println(j+" ----> "+(hash[j]+1)+"\n");
			}
		}
	}
}
