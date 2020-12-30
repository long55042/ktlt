import java.util.Arrays;
import java.util.Scanner;
public class cau_3 {
    private static Scanner input;
    public static int nhap() {
        input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print("nhap n: ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó2" );
                input.nextLine();
            }
        }
        return (n);
    }

    public static int viTriMaxInt(int a[], int n) {
        int max = a[0];
        int key = 0;
        for (int j = 0; j < n; j++) {
            if (max < a[j]) {
                max = a[j];
                key = j;
            }
        }
        return (key);
    }

    public static void inArray(int[] a, int begin, int end) {
        System.out.println();
        int i;
        for (i = begin; i < end; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static int viTriMax2(int[] a, int n) {
        int i, key = 0, Max2 = 0;
        for (i = 0; i < n; i++) {
            if (a[i] > Max2 && a[i] != a[viTriMaxInt(a, n)]) {
                Max2 = a[i];
                key = i;
            }
        }
        return (key);
    }

    public static void themPhanTu(int[] a, int n, int pt) {
        a[0] = pt;
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        System.out.print("Nhap n= ");
        int n = nhap();
        int[] a = new int[n + 1];
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("\n Nhap phan tu thu " + i + " = ");
            a[i] = nhap();
        }
        for (i = 0; i < n; i++) {
            if (a[i] == a[viTriMax2(a, n)])
                System.out.println(" Phan tu thu " + i + " lon thu 2 trong mang a[" + i + "]= " + a[i]);
        }
        Arrays.sort(a);
        inArray(a, 1, n + 1);
        System.out.print("Nhap phan tu muon them pt= ");
        int pt = nhap();
        themPhanTu(a, n + 1, pt);
        inArray(a, 0, n);
    }
}
