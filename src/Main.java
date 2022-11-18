import java.util.Scanner;

public class Main {

    static void Create(int[][] a, int k, int n, int min, int max){
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
    }

    static void Print(int[][] a, int k, int n){
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t|  ", a[i][j]);
            }
            System.out.println();
        }
    }

    static int SumOfMin(int[][] a, int k, int n, int sum){
        for (int i = 0; i < k; i++) {
            if(i % 2 != 0){
                int minimal = a[i][0];
                for (int j = 1; j < n; j++) {
                    if(a[i][j] < minimal){
                        minimal = a[i][j];
                    }
                }
                sum += minimal;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("K = "); int k = scan.nextInt();
        System.out.print("N = "); int n = scan.nextInt();
        int min = -8; int max = 42;
        int[][] a = new int[k][n];

        Create(a, k, n, min, max);
        Print(a, k, n);
        int sum = SumOfMin(a, k, n, 0);
        System.out.println("Сума мінімальних: " + sum);
    }
}