package exercise3;

import java.util.Scanner;

 class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle  = input.nextDouble();
        char einheit = input.next().charAt(0);
         
         do {
           if (einheit == 'r'){
             double gradd = angle*(180.0/Math.PI);
             System.out.println("Angle: " + gradd + "d");
           }else if (einheit == 'd'){
             double gradr = angle*(Math.PI/180.0);
             System.out.println("Angle: "+ gradr + "r");
           }
           angle  = input.nextDouble();
           einheit = input.next().charAt(0);

         }while(einheit=='d' || einheit == 'r');

         

    }
 }

