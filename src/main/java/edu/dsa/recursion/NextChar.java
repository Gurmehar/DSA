package edu.dsa.recursion;

public class NextChar {
	
	public static void main(String[] args) {
		char x=Character.UNASSIGNED;
		x=getNextChar(x);
		x=getNextChar('A');
		x=getNextChar(x);
		x=getNextChar(x);
	}

	private static char getNextChar(Character x) {
		if(x== Character.UNASSIGNED){
			x='A';
		}else{
			int var=x;
			System.out.println(var+" ,, "+x);
			var++;
			x=(char) var;
			System.out.println(var+" , "+x);
		}
		return Character.valueOf(x);

		
	}

}
