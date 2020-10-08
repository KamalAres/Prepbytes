package Prepbytes;

import java.util.*;
import java.io.*;

public class PrepbuddyAndScoks {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int arr[] = new int[T];
    for(int i=0;i<T;i++){
      arr[i] = sc.nextInt();
      System.out.println(arr[i]+1);
    }
    
  }
}