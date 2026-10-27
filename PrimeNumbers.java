public class PrimeNumbers{

public static boolean esPrimo(int n) {
        // Los números menores o iguales a 1 no son primos
        if (n <= 1) {
            return false;
        }
        // El 2 es el único número primo par
        if (n == 2) {
            return true;
        }
        // Descartar otros números pares
        if (n % 2 == 0) {
            return false;
        }
        // Comprobar divisores impares hasta la raíz cuadrada
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 29;
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}