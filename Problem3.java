import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m= scn.nextInt();
        int n= scn.nextInt();
        int[][] arr1 = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr1[i][j]= scn.nextInt();
            }
        }

        int[][] arr2 = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr2[i][j]= scn.nextInt();
            }
        }

        int sum=0;
        for(int k=0;k<m;k++)
        {
            for(int l=0;l<n;l++)
            {
                sum=arr1[k][l]+arr2[k][l];
                System.out.print(sum+" ");
            }
            System.out.println();
        }

    }
}
