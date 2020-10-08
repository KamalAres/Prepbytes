package Prepbytes;

import java.util.*;
import java.io.*;

public class LeapYear {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0;i<T;i++){
      int year = sc.nextInt();
      if(Leap(year))
    	  System.out.println("Yes");
      else
    	  System.out.println("No");
    }
    
  }
  public static boolean Leap(int year) {
	  if ((year>0)&&((year%4==0)&&(year%100!=0)||(year%400==0)))
			  return true;
	  else
		  return false;
  }
}