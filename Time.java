import java.util.*;
public class Time{
 public static void main(String[] args) {

 System.out.println("This program will translate hours and
minutes into seconds, yay.");
 System.out.println("");

 int h, m, num3;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the hour: ");
 h = sc.nextInt();
 System.out.println("");

 Scanner sx = new Scanner(System.in);
 System.out.print("Enter the minutes: ");
 m = sx.nextInt();
 System.out.println("");
 num3 = h * 3600 + m * 60;
 System.out.print("Seconds: " + num3);
 }
}