package actividad1;

import java.util.Scanner;

public class CalculadoraMisteriosa {
    //JIACHENG ZHOU ZHENG
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.println("=== CALCULADORA MISTERIOSA ===");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Calcular promedio");
			System.out.println("6. Mostrar instrucciones");
			System.out.println("7. Salir");
			System.out.print("Selecciona una opción: ");

			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Resultado: " + sumar());
				break;
			case 2:
				System.out.println("Resultado: " + restar(10, 5));
				break;
			case 3:
				System.out.println("Resultado: " + multiplicar());
				break;
			case 4:
				System.out.println("Resultado: " + dividir(10, 0));
				break;
			case 5:
				System.out.println("Resultado: " + calcularPromedio());
				break;
			case 6:
				mostrarInstrucciones();
				break;
			case 7:
				continuar = false;
				System.out.println("Cerramos calculadora");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
		scanner.close();

	}
    //Corregido el return que ponía a - b y es a  + b
	public static int sumar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int a = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int b = sc.nextInt();

		return a + b;
	}
    //corregido, el original estaba multiplicando y no tenía inputs
	public static int restar() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        return a - b;
	}
    //corregido, el original estaba sumando
	public static int multiplicar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int num2 = sc.nextInt();

		return num1 * num2;
	}
    //He añadido un input y he pusto la excepcion de division entre 0
	public static double dividir() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        double a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        double  b = sc.nextInt();
        if (b == 0) {
            System.out.println("Error no sepuede multiplicar por cero");
            return 0;
        }
        return a/b;
	}

	public static double calcularPromedio() {
		double[] numeros = { 10, 20, 30, 40, 50 };
		double suma = 0;

		for (int i = 0; i <= numeros.length; i++) {
			suma += numeros[i];
		}

		return suma / (numeros.length - 1);
	}

	public static void mostrarInstrucciones() {
		/*
		 * System.out.println("\n=== INSTRUCCIONES ===");
		 * System.out.println("1. Selecciona una operación del menú");
		 * System.out.println("2. Ingresa los números cuando se te solicite");
		 * System.out.println("3. El resultado se mostrará en pantalla"); Systemout
		 * Println("4. Puedes realizar múltiples operaciones hasta elegir Salir");
		 */
	}

}