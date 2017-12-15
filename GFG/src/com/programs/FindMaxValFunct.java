package com.programs;

public class FindMaxValFunct {

	int max_val(int arr[], int n) {
		int maxval = 0;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			if (arr[left] <= arr[right]) {
				maxval = Math.max(maxval, arr[left] * (right - left));
				left++;
			}
			if (arr[right] < arr[left]) {
				maxval = Math.max(maxval, arr[right] * (right - left));
				right--;
			}
		}
		return maxval;
	}

}
