package Prepbytes;

import java.util.*;
import java.io.*;

public class ReverseNumber {
	static int rev;
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count=0;
    while(num%10==0) {
    	count++;
    	num /= 10;
    }
    while(num>0) {
    	rev = rev*10 + num%10;
    	num /= 10;
    }
    System.out.println(rev+" "+count);
   
  }
  
}