import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        if (n>1)
        {
            System.out.println("The required triangle is");
        }
        else
        {
            System.out.println("enter number greater than 1");
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (j<=i)
                {System.out.print(j+1);}
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                if (j<=i)
                {System.out.print(j);}
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }


    }




