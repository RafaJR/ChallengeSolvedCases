package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {


    public static void main(String[] args) {
    	
//    	final String regex = ".{3}\\..{3}\\..{3}\\..{3}";
//    	final String regex = "(\\S{2}\\s){2}\\S{2}";
//    	final String regex = "\\w{3}\\W\\w{10}\\W\\w{3}";
    	final String regex = "^\\d\\w{4}\\.$";
    	
        Tester tester = new Tester();
        tester.check(regex); 
    
    }
}

class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        
        System.out.format("%s", match);
    }   
    
}