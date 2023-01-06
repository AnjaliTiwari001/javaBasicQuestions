public class Problem6 {
    public static void main(String[] args) {

        int[][] arr = new int[8][12];
        int c = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j] = c;
                c += 1;
            }
        }

        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 12; l++) {
                if (arr[k][l] % 5 == 0 && arr[k][l] % 7 == 0) {
                    arr[k][l] = -3;
                } else if (arr[k][l] % 5 == 0) {
                    arr[k][l] = -2;
                } else if (arr[k][l] % 7 == 0) {
                    arr[k][l] = -1;
                }
            }

        }


        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 12; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();

        }
    }
}
