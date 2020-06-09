import java.util.*;
public class jednotkacas{
    public static void main(String[] args) {

        System.out.println("Hodiny -> vteriny.");
        System.out.println("");

        int h, m, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej pocet hodin: ");
        h = sc.nextInt();

        System.out.println("");

        Scanner sx = new Scanner(System.in);
        System.out.print("Zadej pocet minut: ");
        m = sx.nextInt();

        System.out.println("");

        num3 = h * 3600 + m * 60;

        System.out.print("Vterin: " + num3);

    }
}