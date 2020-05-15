import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
        System.out.println("Napis cisla plsss");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r;
        while (n != 0) {
            r = n % 10; //r=2
            System.out.print(r);
            n = ((n - r) / 10);
        }
    }
}