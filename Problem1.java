import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[20];
        arr[0]=scn.nextInt();
        for(int i=0 ; i<20;i++)
        {
            if (i>0)
            {
            arr[i]= arr[i-1]+5;
            if (arr[i]>=100)
                {
                    arr[i]=arr[0];
                }
            }

        }
        for(int i=0 ; i<20;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
