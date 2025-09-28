package biblioteca_app;
import java.util.Scanner;

public class Biblioteca_App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibroController lc = new LibroController();
        
        Libro l1 = new Libro("12.12.12", "ROJO", "COLORES", true);
        Libro l2 = new Libro("23.23.23", "AZUL", "COLORES", true);
        Libro l3 = new Libro("34.34.34", "ROSA", "COLORES", true);
        Libro l4 = new Libro("45.45.45", "VERDE", "COLORES", true);
        
        lc.Agregar_Libro(l1);
        lc.Agregar_Libro(l2);
        lc.Agregar_Libro(l3);
        lc.Agregar_Libro(l4);
        
        lc.Mostrar_Libro();
        
        System.out.println("BUSCAR LIBRO");
        System.out.println("Ingrese el IDBN del libro que desea adquirir:");
        String iba = sc.nextLine();
        lc.Prestar_Libro(iba);
        
        lc.Mostrar_Libro();
        
        System.out.println("BUSCAR LIBRO");
        System.out.println("Ingrese el IDBN del libro que desea devolver:");
        String ibd = sc.nextLine();
        lc.Devolver_Libro(ibd);
        
        lc.Mostrar_Libro();
    }
}