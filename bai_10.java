
import java.util.Scanner;

    public class bai_10 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("mảng có số phần tử là: ");
            int n = s.nextInt();
            int[] A = new int[n];


            //ý 1
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
                A[i] = s.nextInt();
            }
            System.out.println("\nMảng vừa nhập: ");
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + "  ");
            }


            //ý 2
            int m = 0;
            System.out.println("");
            System.out.print("\nSố giá trị chia hết cho 5 mà không chia hết cho 6 là: ");
            for (int i = 0; i < n; i++) {
                if (A[i] % 5 == 0) {
                    if (A[i] % 6 != 0) {
                        m++;
                    }
                }
            }
            System.out.println(m);


            //ý 3
            int q = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] % 2 != 0) {
                    q++;
                }
            }
            System.out.println("\nSố phần tử trong mảng có giá trị lẻ là: " + q);


            //ý 4
            int T = 0;
            int TB = 0;
            for (int i = 0; i < n; i++) {
                T += A[i];
            }
            TB = T / n;
            int D = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] >= TB) {
                    D++;
                }
            }
            System.out.println("\ncó " + D + "phần tử có giá trị lớn hơn hoặc bằng giá trị trung bình của tất cả các giá trị trong mảng");


            //ý 5
            int j = 0;
            int[] C = new int[n];
            for (int i = 0; i < n; i++) {
                if (A[i] % 2 != 0) {
                    C[j] = A[i];
                    j++;
                }
            }
            System.out.println("\nCác phần tử của mảng là số lẻ gồm: ");
            for (int i = 0; i < j; i++) {
                System.out.print(C[i] + "  ");
            }
        }
    }
