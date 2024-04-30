import java.util.Scanner;
public class MainSuma {
    public static void main(String[] args) {
        Suma n1 = new Suma();
        Scanner num= new Scanner (System.in);
        System.out.println("Suma de 2 numeros");
        System.out.println("Ingrese un numero:");
        n1.setA(num.nextInt());
        System.out.println("Ingrese segundo numero:");
        n1.setB(num.nextInt());
        System.out.println("El resultado es:");
        System.out.println(n1.sumar());
        System.out.println(n1);
        n1.getA();
        n1.getB();
    
    }
}