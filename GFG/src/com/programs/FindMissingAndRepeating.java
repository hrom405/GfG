package com.programs;

import java.util.Scanner;

/*https://practice.geeksforgeeks.org/problems/find-missing-and-repeating/0*/
public class FindMissingAndRepeating {

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int p=0; p<T; p++)
		{
		    int N = sc.nextInt();
		    int[] arr = new int[N];
		    
		    for(int i=0; i<N; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    
		    printMissingAndRepeating(arr);
		}
	}
	
	
	public static void printMissingAndRepeating(int[] arr)
	{
	    int N = arr.length;
	    int duplicateIndMin = arr.length+1;
	    int missingInd=0;
	    for(int i=0; i<arr.length; i++)
	    {
	        int index = (arr[i]-1)%N;
	        
	        if(arr[index]>N)
	        {
	            duplicateIndMin = Math.min(duplicateIndMin, index+1);
	        }
	        else{
	            arr[index] = arr[index]+N;
	        }
	    }
	    
	    for(int i=0; i<arr.length; i++)
	    {
	        if(arr[i]<=N)
	        {
	            missingInd = i+1;
	        }
	    }
	    
	    System.out.println(duplicateIndMin+" "+missingInd);
	}

}
