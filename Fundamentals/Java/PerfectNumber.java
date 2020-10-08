package Prepbytes;

import java.util.*;
import java.io.*;

public class PerfectNumber {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0;i<T;i++){
      int num = sc.nextInt();
      System.out.println(factors(num)==num?true:false);
    }
    
  }
  public static int factors(int num){
    int sum = 0;
    for(int i=1;i<num;i++){
      if(num%i==0){
        sum += i;
      }
    }
    return sum;
  }
}