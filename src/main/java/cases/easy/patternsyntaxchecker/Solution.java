package cases.easy.patternsyntaxchecker;
// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			
			System.out.println(checkPattern(pattern) ? "Valid" : "Invalid");
			
			testCases --;
		}
	}
	
	private static boolean checkPattern(String pattern) {
	    
	    try {
		
		Pattern.compile(pattern);
		
	    }catch(PatternSyntaxException e) {
		return false;
	    }
	    
	    return true;
	    
	}
}