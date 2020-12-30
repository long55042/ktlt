import java.util.Scanner;

public class Cau_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        //viet ham nhap va  hiển thị các giá trị trong mảng a
        for (int i = 0; i < n; i++){
            System.out.println("phan tu thu" + i + ":");
            a[i] = sc.nextInt();

        }
        System.out.println("mang vua nhap nhap la:");
        for (int i = 0; i < n; i++){
            System.out.println(a[i] + "\t");
            }
        //viet ham dem trong mang a co bao nhieu gia tri chia het cho 3 ma khong chia het cho 2
        int dem = 1;
        for (int i =0;i<n;i++) {
            if (a[i] % 3 == 0 && a[i] % 2 != 0) {
                dem++;
            }
        }
        System.out.println("co" + dem +"so phan tu chia het cho 3 ma khong chia het cho 2");
        //viet ham tim gia tri lon nhat trong mang a
        int max = a[0];
        for ( int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(" gia tri lon nhat trong mang la: " + max);
        //Viết hàm kiểm tra xem giá trị X (Nhập vào từ bàn phím) có tồn tại trong mảng A hay không
        int x, m;
        System.out.println("nhap gia tri can kiem ta");
        int Dem =0;
        for ( int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("trong mang A co " + dem + "gia tri chan");
        //Viết hàm đếm số phần tử trong mảng A có giá trị Chẵn
        int j = 0;
        int[] b = new int[n];
        for ( int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println("cac phan tu so chan trong mang b la: ");
        for ( int i = 0; i < n; i++) {
            System.out.println(b[i] + "\t");
        }
    }
}
