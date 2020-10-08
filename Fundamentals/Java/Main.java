
package Prepbytes;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int N;
    for(int i=0;i<T;i++){
      N = sc.nextInt();
      while(NFibonacci(N)==0) {
    	  N++;
    	  }
      System.out.println(NFibonacci(N));
      
    }
    
  }
  public static int NFibonacci(int N){
    int num1=0,num2=1,sum=0;
    for(int i=0;i<N;i++){
      sum = num1+num2;
      if(sum%2==0) {
    	  num1 = num2;
    	  num2 = sum;
      }
      else {
    	  while(sum%2!=0) {
    		  sum = num1+num2;
    		  num1 = num2;
    		  num2 = sum;
    		  
    	  }
      }
    }
    return sum;
  }
}