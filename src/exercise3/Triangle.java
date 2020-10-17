package exercise3;

import java.util.Scanner;

public class Triangle {
  public static void main (String [] args) {
    Scanner input=new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double s = (a+b+c)/2;
    double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    do{
    if(a>0 && b>0 && c>0 && (a+b)>c && (a+c)>b && (b+c)>a) {
      System.out.print("Area"+ Area);
    if(a==b || b==c || c==a){
      System.out.print("Triangle:equiliteral");
    }else if (a==b && b==c && c!=a) {
      System.out.print("Triangle: isosceles");
    }else if (a!=b && b!=c && c!=a) {
      System.out.print("Triangle:scalene");
    }


    }else {
      System.out.print("Values are not correct!");
    }
    a=input.nextDouble();
    b=input.nextDouble();
    c=input.nextDouble();
    }while (a>0 && b>0 && c>0);
    }

    }
  