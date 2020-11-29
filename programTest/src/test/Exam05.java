package test;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		int nums[] =new int[10];
		int sum =0;
		int otherSum = 0;
		
		Scanner scn = new Scanner(System.in);
	

		for(int i =0 ; i<nums.length;i++ ) {
			System.out.println("int["+i+"]> ");
			nums[i] = scn.nextInt();
			
			if(nums[i]%2==0) {
				sum += nums[i];
			} else if(nums[i]%2==1) {
				otherSum += nums[i];
			}
			
			
		}
		System.out.println("짝수의 합: " + sum);
		System.out.println("홀수의 합: " + otherSum);
	}
	


	
			
			
			

}



