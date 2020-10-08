package Prepbytes;

import java.util.*;
import java.io.*;

public class ClockAngles {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0;i<T;i++){
      int hour = sc.nextInt();
      int minutes = sc.nextInt();
      System.out.println(hour+" "+minutes);
      System.out.println((int)(180 - Math.abs (180 - Math.abs ( minutes * 6 - (hour * 30 + minutes * 0.5) ) )));
 
    }
    
  }
}