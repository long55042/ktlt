import java.util.Scanner;

    public class bai_9 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Mảng có số phần tử là : ");
            int n = s.nextInt();
            int[] A = new int[n];

            //1.1
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập giá trị phần tử thứ " + (i+1) + ": ");
                A[i] = s.nextInt();
            }
            System.out.println("\nMảng vừa nhập: ");
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + "\t");
            }

            //1.2
            int dem = 0;
            System.out.println("");
            System.out.print("\nSố giá trị chia hết cho 3 mà không chia hết cho 4 là : ");
            for (int i = 0; i < n; i++) {
                if (A[i] % 3 == 0) {
                    if (A[i] % 4 != 0) {
                        dem++;
                    }
                }
            }
            System.out.println(dem);

            //1.3
            int max = A[0];
            int min = A[0];
            for (int i = 0; i < n; i++) {
                if (max < A[i]) {
                    max = A[i];
                }
                if (min > A[i]) {
                    min = A[i];
                }
            }
            System.out.print("\nGiá trị lớn nhất trong mảng là : " + max);
            System.out.print("\nGiá trị nhỏ nhất trong mảng là : " + min);

            //1.4
            int X, m;
            System.out.println("");
            System.out.print("\nNhập vào giá trị cần kiểm tra trong mảng: ");
            m = s.nextInt();
            for (X = 0; X < n; X++) {
                if (A[X] == m) {
                    System.out.println(m + " đang tồn tại trong mảng. ");
                    break;
                }
            }
            if (X == n)
                System.out.println(m + " không tồn tại trong mảng.");

            //1.5
            int Dem = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] % 2 == 0) {
                    Dem++;
                }
            }
            System.out.println("\nSố các số chẵn trong mảng là : " + Dem);

            //1.6
            int j =0;
            int[] B = new int[n];
            for (int i=0;i<n;i++) {
                if (A[i] % 2 == 0) {
                    B[j] = A[i];
                    j++;
                }
            }
            System.out.println("\nCác phần tử của mảng là số chẵn gồm: ");
            for (int i = 0; i < j; i++) {
                System.out.print(B[i] + "\t");
            }
        }
    }

