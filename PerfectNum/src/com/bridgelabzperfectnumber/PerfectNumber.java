package com.bridgelabzperfectnumber;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		int perfectNum = 28;
		int sumOfDivisors = 0;
		int i;
		for (i = 1;i <=perfectNum/2; i++) 
		{
			if (perfectNum%i == 0) {
				sumOfDivisors = sumOfDivisors + i;
			
		}
		}
		if (sumOfDivisors == perfectNum) {
			System.out.println(perfectNum+" is a perfect number."); 
		}else {
			System.out.println(perfectNum+" is a Not perfect number."); 

	}

	}
}
