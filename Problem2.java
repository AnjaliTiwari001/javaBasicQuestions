import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        byte [] arr = new byte[5];
        int sum=0;
        for(int i=0 ; i<5;i++)
        {
            arr[i]=scn.nextByte();
            sum+=arr[i];
        }
        System.out.println(sum); //-127 range 127
    }
}
