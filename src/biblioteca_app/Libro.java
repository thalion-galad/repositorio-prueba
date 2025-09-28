package biblioteca_app;


public class Libro {
    private String Isbn;
    private String Titulo;
    private String Autor;
    private boolean Disponible;

    public Libro(String Isbn, String Titulo, String Autor, boolean Disponible) {
        this.Isbn = Isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Disponible = Disponible;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }
    
    void Ver_Datos() {
        System.out.println("LIBRO\n\tISBN: " + this.Isbn + "\n\tTITULO: " + this.Titulo + "\n\tAUTOR: " + this.Autor
                + "\n\tDISPONIBLE: " +this.Disponible);
    }
    
    void Estado_Libro(boolean dispo) {
        this.Disponible = dispo;
    }
}
