package edu.dsa.recursion;

public class Regex {

	public static void main(String[] args) {
		
		 String x ="hjdg$h&jk8^i0s)sh6//";
		x= x.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(x);
		 
	}
}

