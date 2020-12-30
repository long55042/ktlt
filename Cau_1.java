import java.util.Scanner;
public class Cau_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x:");
        int x = sc.nextInt();
        System.out.println("nhap y:");
        int y = sc.nextInt();
        if(x>3&& y>3) {
            System.out.println("truoc khi hoan vi" + x + "\t" + y);
            int c = x;
            x = y;
            y = c;
            System.out.println("sau khi hoan vi " + x + "\t" + y);
        }else{
            System.out.println("yeu cau nhap lai:");


        }
    }
}
