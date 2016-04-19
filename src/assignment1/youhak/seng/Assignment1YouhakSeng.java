package assignment1.youhak.seng;

import java.util.Scanner;

public class Assignment1YouhakSeng {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
//          Scanner input = new Scanner();
        
        System.out.print("Please Enter positive integer for pattern 1: ");
        int x = input.nextInt();
        System.out.print("Please Enter positive integer for pattern 2: ");
        int y = input.nextInt();
       
        displayPartern(x);
        System.out.println();
        displayPattern2(y);
    }
    public static void displayPartern(int n) {
        for (int i = 1; i <= n+1; i++) {//vertical line
            for (int u = n; u > 0; u--) {//horizontal line
                if(u<i)
                System.out.printf("%4d", u);
                else
                System.out.print("    ");
            }
            System.out.println();
        }
    }

    public static void displayPattern2(int m) {
        int k = 1;//sentinel value
        for (int g = m; g > 0; g--) {//vertical line
            for (int h=1; h<=m ;h++) {//horizontal line
                if ( g<=h )//value of g and h catch up and g less than h 
                    //print k+1
                System.out.printf("%4d",k++);
              
                else
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}
