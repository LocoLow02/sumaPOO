import java.util.Scanner;
public class MainSuma {
    public static void main(String[] args) {
        Suma n1 = new Suma();
        Scanner num= new Scanner (System.in);
        System.out.println("Suma de 2 numeros");
        System.out.println("Ingrese un numero:");
        int a= num.nextInt();
        n1.a=a;
        System.out.println("Ingrese segundo numero:");
        int b= num.nextInt();
        n1.b=b;
        System.out.println("El resultado es:");
        System.out.println(n1.sumar());
    
    }
}