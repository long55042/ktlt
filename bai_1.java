import java.util.Scanner;

    public class bai_1 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("kiem tra so can kiem tra :");
        n= scanner.nextInt();
        if(n<2){
            System.out.println("nhap lai n>=2!");
            return;
        }
        if(n % 2 == 0)
        {
            System.out.println("day la so chan");
        }
        else
        {
            System.out.println("day la so le");
        }
    }
}
