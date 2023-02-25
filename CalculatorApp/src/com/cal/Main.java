package com.cal;

public class Main {

	public static void main(String[] args) {
		
		Calculator solution = new Solution();
		
		System.out.println(solution.sum(7,4));
		System.out.println(solution.sub(7,3));
		System.out.println(solution.mul(9,5));
		System.out.printf("%.2f",(solution.div(16,3.5)));

	}

}

