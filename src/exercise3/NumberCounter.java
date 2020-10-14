package exercise3;

import java.util.Scanner;

public class NumberCounter {

public static void main (String [] args) {
  Scanner input = new Scanner (System.in);

  int count = 0;
  int positive = 0;
  int negative = 0;
  int sum = 0;
  int avarage = 0;
  int number = input.nextInt();

  while (number!=0) {
  
    if (number>0) {
      System.out.print("Positive Number");
    }else 
    System.out.print("Negative Number");
  
     count++;
     sum=sum+number;
     avarage=count/sum;
     number=input.nextInt();
  }

System.out.println("Sum:"+sum);
System.out.println("Avarage:"+avarage);


}
}
