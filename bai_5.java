import java.util.Scanner;
public class bai_5 {
   boolean KTSNT (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Kiem tra so nguyen to \n");
        int n = s.nextInt();
        bai_5 snt = new bai_5();
        if (snt.KTSNT(n)) {
            System.out.printf("So : " + n + " la so nguyen to");
        } else {
            System.out.printf("So : " + n + " khong phai la so nguyen to");
        }
    }
}

