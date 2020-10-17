package exercise3;

import java.util.Scanner;

public class NumberSearch {

  public static void main (String [] args) {
  Scanner input = new Scanner (System.in);

  int count = 0;

  for (int n=100; n<=1000; n++) {
    if(n%5==0 && n%6==0) {
      count++;

      if(count==10) {
        count=0;
        System.out.print(n);
        System.out.println();
      }else
      System.out.print(n + "");
    }
  }
}
}