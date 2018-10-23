package edu.dsa.recursion;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(new Factorial().getFactorail(7));

	}

	private int getFactorail(int i) {
		if(i==0)return 1;
		else if(i==1)return 1;
		else{
			return i*(getFactorail(i-1));
		}
		
	}

}
