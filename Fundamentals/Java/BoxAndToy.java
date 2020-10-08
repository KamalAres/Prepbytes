package Prepbytes;

import java.util.*;
import java.io.*;

public class BoxAndToy {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int count=0,N=sc.nextInt();
    for(int i=0;i<N;i++){
      int ti = sc.nextInt();
      int ci = sc.nextInt();
      if(ti+2<=ci)
        count++;
    }
    System.out.println(count);
    
  }
}