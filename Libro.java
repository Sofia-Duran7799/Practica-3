/**
 * Clase que representa un libro con título, autor, año de publicación y ISBN.
 * 
 * @author (tu nombre) 
 * @version (una versión o fecha)
 */
public class Libro {
    // Libro tiene 4 atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int añoPublicacion;

    /**
     * Constructor para inicializar todos los atributos de la clase Libro.
     * 
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param isbn El número ISBN del libro.
     * @param añoPublicacion El año de publicación del libro.
     */
    public Libro(String titulo, String autor, String isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Método para obtener la información completa del libro.
     * 
     * @return Una cadena con la información del libro.
     */
    public String getInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + añoPublicacion + ", ISBN: " + isbn;
    }

    /**
     * Método para determinar si el libro es antiguo.
     * 
     * @return true si el libro fue publicado hace más de 20 años, false en caso contrario.
     */
    public boolean esAntiguo() {
        int añoActual = java.time.Year.now().getValue(); // Obtiene el año actual
        return (añoActual - añoPublicacion) > 20;
    }

    /**
     * Método para obtener una representación en cadena del objeto Libro.
     * 
     * @return Una cadena que representa el objeto Libro.
     */
    @Override
    public String toString() {
        return "Libro[Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion + ", ISBN: " + isbn + "]";
    }

    /**
     * Método get para obtener el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método get para obtener el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método get para obtener el ISBN del libro.
     * 
     * @return El ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Método get para obtener el año de publicación del libro.
     * 
     * @return El año de publicación del libro.
     */
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
}