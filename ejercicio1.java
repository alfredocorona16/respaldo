
import java.util.Scanner;
public class ejercicio1 {



public static void main(String[] args) {
    // Ejercicio 1
Scanner teclado = new Scanner(System.in);
    double sueldos = 0;
    int categoria;

    System.out.println("Ingrese su categoria: ");
    categoria = teclado.nextInt();

    if (categoria == 1) {
        sueldos = 15890  + 0.10;
        System.out.println("tu nomina es de: " + sueldos);
    }
    else if (categoria == 2) {
        sueldos = 25630.89;
        System.out.println("tu nomina es de: " + sueldos);
    }
    else if (categoria == 3) {
        sueldos = 35560.20 - 0.11;
        System.out.println("tu nomina es de: " + sueldos);
    }
    else {
        System.out.println("Categoria invalida");
    }

    if (categoria == 1 || categoria == 2 || categoria == 3) {
        
    
    System.out.println("el total de sueldo es:" + categoria + "=" + sueldos);
    }
    // cerrar scanner
    teclado.close();
}
}