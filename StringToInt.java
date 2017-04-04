package test;

import java.util.Scanner;

public class StringToInt {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	stringtoint(str);
}

public static void stringtoint(String s){      
    int checkNeg=0;
    int number =0;      
    if (s.charAt(0)=='-') {
    	checkNeg=1;            
    }
    else{
        number = number* 10 + s.charAt(0)-'0';  //this will extract first number from string and store it an integer
        
    }

    for (int i = 1; i < s.length(); i++) {

        number = number*10 + s.charAt(i)-'0';     // this will generate entire number character by character       
    }
    if(checkNeg==1){
        number = -1*number;
    }
    System.out.println(number);
}
}
