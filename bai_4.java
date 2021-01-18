public class bai_4 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Liệt kê tất cả số nguyên tố có 5 chữ số:");
        for (int i = 10001; i < 99999; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Tổng các số nguyên tố có 5 chữ số là: " + count);
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
