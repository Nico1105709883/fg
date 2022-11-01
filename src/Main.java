import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de b");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de c");
        double c = sc.nextDouble();
        sc.close();
        double root = Math.sqrt(Math.pow(b, 2)-4*a*c);
        double x1 = (-b + root)/(2*a);
        double x2 = (-b - root)/(2*a);
        if (Double.isNaN(x1)){
            ;
        }else{
            System.out.println("el valor de x1 es: "+x1);
        }
        if (Double.isNaN(x2)){
            System.out.println("No tiene solucion");
        }else{
            System.out.println("el valor de x2 es: "+x2);
        }
    }
}
