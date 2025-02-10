package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }
    public static double mod(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a % b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nCALCULADORA");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. MOD");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingresa el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                double num2 = scanner.nextDouble();
                double resultado = 0;
                switch (opcion) {
                    case 1:
                        resultado = sumar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = restar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 5:
                        resultado = mod(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                }
            } else if (opcion == 6) {
                System.out.println("Has salido de la calculadora,gracias por usar");
            } else {
                System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}