// Q3. Write a program in java to rotate an array by N positions ? 
// Expected Output: 
// The given array is: 0  3  6  9  12  14  18  20  22  25  27 
// From 4th position the values of the array are: 12 14 18 20 22 25 27  
// Before 4th position the values of the array are: 0  3  6  9  
// After rotating from 4th position the array is: 
// 12 14 18 20 22 25 27 0 3  6 9

import java.util.*;
class Q3RotateArrayByNPos {
	  void main() {
		int [] arr = {0,3,6,9,12,14,18,20,22,25,27};
		
		int a = 0;
		int pos = 4;
		int start = 0;
		int end = arr.length-1;
		// while(start<end) {
			// int temp = arr[end];
			// arr[end] = arr[start];
			// arr[start] = temp;
			// start++;
			// end--;
		// }
		
		// for(int i = pos;i<arr.length;i++) {
			// arr[a++] = arr[i];
		// }
		// for(int i =arr.length-4;i<arr.length-1;i++) {
			 // arr[i] = arr[i+1];
		// }
		// for(int i = ;i<arr.length;i++) {
			// arr[a++] = arr[i];
		// }
		
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	  }
}   