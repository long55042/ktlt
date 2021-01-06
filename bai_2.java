import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu nhat:");
       int a = scanner.nextInt();
        System.out.println("nhap so a:");
       int b = scanner.nextInt();
        System.out.println("nhap so b:");
       int c = scanner.nextInt();
        System.out.println("nhap so c:");
        if (a >= b && a >= c) {
            System.out.println("so lon nhat trong ba so la:" + a);
        }
        if (b >= a && b >= c) {
            System.out.println("so lon nhat trong ba so la:" + b);
        }
        if (c >= a && c >= b) {
        }

    }
}

