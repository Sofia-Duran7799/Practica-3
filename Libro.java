public class Libro {
    private String titulo;
    private Autor autor;  // Cambiamos el tipo de String a Autor
    private String isbn;
    private int añoPublicacion;
    private boolean prestado;  // Nuevo atributo para identificar si el libro está prestado

    /**
     * Constructor para inicializar todos los atributos de la clase Libro.
     * 
     * @param titulo El título del libro.
     * @param autor El autor del libro (objeto de tipo Autor).
     * @param isbn El número ISBN del libro.
     * @param añoPublicacion El año de publicación del libro.
     */
    public Libro(String titulo, Autor autor, String isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.prestado = false;  // Por defecto, el libro no está prestado
    }

    /**
     * Método para obtener la información completa del libro.
     * 
     * @return Una cadena con la información del libro.
     */
    public String getInformacion() {
        return "Título: " + titulo + ", Autor: " + autor.getNombre() + ", Año de Publicación: " + añoPublicacion + ", ISBN: " + isbn;
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
        return "Libro[Título: " + titulo + ", Autor: " + autor.getNombre() + ", Año: " + añoPublicacion + ", ISBN: " + isbn + "]";
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
    public Autor getAutor() {
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

    /**
     * Método para saber si el libro está prestado.
     * 
     * @return true si el libro está prestado, false en caso contrario.
     */
    public boolean estaPrestado() {
        return prestado;
    }

    /**
     * Método para prestar el libro.
     */
    public void prestar() {
        this.prestado = true;
    }

    /**
     * Método para devolver el libro.
     */
    public void devolver() {
        this.prestado = false;
    }
}