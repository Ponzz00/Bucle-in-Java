/**
 * Bucle while que termina cuando se introduce por teclado un
 * n�mero negativo.
 *
 * @author Luis Jos� S�nchez
 */
public class CuentaPositivos {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo n�meros y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un n�mero negativo.");
    
    int numeroIntroducido = 0;
    int cuentaNumeros = 0;
    int suma = 0;
        
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      cuentaNumeros++; // Incrementa en uno la variable
      suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
    }
    
    System.out.println("Has introducido " + (cuentaNumeros - 1) + " n�meros positivos.");
    System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
  }
}