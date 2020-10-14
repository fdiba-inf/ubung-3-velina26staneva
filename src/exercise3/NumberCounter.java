package exercise3;

import java.util.Scanner;

public class NumberCounter {

public static void main (String [] args) {
  Scanner input = new Scanner (System.in);

  double positivecount = 0;
  double negativecount = 0;
  double sum = 0;

  int number = input.nextInt();

  while (number!=0) {
  
    if (number>0) {
      positivecount++;
    }else {
      negativecount++;
    }
     sum=sum+number;
     number=input.nextInt();
     
  }
  double average=sum/(positivecount + negativecount);
System.out.println("positivecount"+ positivecount);
System.out.println("negativcount"+ negativecount);
System.out.println("Sum:"+ sum);
System.out.println("Average:"+average);


}
}
