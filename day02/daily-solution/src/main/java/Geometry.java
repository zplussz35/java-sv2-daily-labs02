import java.util.*;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a: ");
        double a=Double.parseDouble(sc.nextLine());
        System.out.print("Give b: ");
        double b=Double.parseDouble(sc.nextLine());
        Rectangle rec = new Rectangle(a,b);
        System.out.println("The area: "+rec.calculateArea());
    }
}
