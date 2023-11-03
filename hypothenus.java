import java.util.Scanner;
public class hypothenus {

    public static void main(String[] args) {
        double x=4;
        double y=18;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("the value of x :");
       x=scanner.nextDouble();
       System.out.println("the value of y :");
       y=scanner.nextDouble();
       System.out.println("the value of x is ="+ x);
       System.out.println("the value of y is ="+ y);
       z=Math.sqrt((x*x)+(y*y));
       System.out.println("the hypotenus is"+ z);
    }
}