package com.cal;

public class Solution extends Calculator {

	@Override
	public int sum(int... numbers) {
		int result = 0;
		for(int i=0; i<numbers.length; i++) {
			result +=numbers[i];
		}
		return result;
	}

	@Override
	public int sub(int... numbers) {
		int result = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			result -=numbers[i];
		}
		return result;
	}

	@Override
	public long mul(long... numbers) {
		long result = 1;
		for(int i=0; i<numbers.length; i++) {
			result *=numbers[i];
		}
		return result;
	}

	@Override
	public double div(double... numbers) {
		double result = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			result /= numbers[i];
		}
		return result;
	}

	
}

