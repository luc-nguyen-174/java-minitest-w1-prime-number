import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bài 1: Viết chương trình cho phép nhập vào số n.\n" +
                "In ra những số nguyên tố nhỏ hơn số n vừa nhập vào từ bàn phím.");

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số n:");
        int n = input.nextInt();

        if (n > 1) {
            System.out.println("Hiển thị các số nguyên tố nhỏ hơn " + n + ".");
            System.out.print(2);
        }
        int count = 1;
        for (int i = 3; i <= n; i++) {
            int check = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    check = check + 1;
                }
            }
            if (check == 2) {
                System.out.print(" " + i);
                count++;
            }
        }
        System.out.println("\nCó tất cả "+count+" số nguyên tố.");
    }
}