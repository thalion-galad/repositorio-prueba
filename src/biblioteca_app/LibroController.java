package biblioteca_app;
import java.util.ArrayList;


public class LibroController {
    ArrayList<Libro> Lista_Libro = new ArrayList();
    
    void Agregar_Libro(Libro new_libro) {
        Lista_Libro.add(new_libro);
    }
    
    void Mostrar_Libro() {
        for(Libro li : Lista_Libro) {
            li.Ver_Datos();
        }
    }
    
    void Prestar_Libro(String isbn_bus) {
        for(Libro li : Lista_Libro) {
            if(li.getIsbn().equals(isbn_bus)) {
                li.Estado_Libro(false);
                li.Ver_Datos();
                return;
            }
        }
        System.out.println("ISBN no encontrado");
    }
    
    void Devolver_Libro(String isbn_bus) {
        for(Libro li : Lista_Libro) {
            if(li.getIsbn().equals(isbn_bus)) {
                li.Estado_Libro(true);
                li.Ver_Datos();
                return;
            }
        }
        System.out.println("ISBN no encontrado");
    }
}
