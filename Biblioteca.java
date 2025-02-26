import java.util.ArrayList;

public class Biblioteca {
    // La clase biblioteca tiene 1 atributo
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        if (libro != null) {
            libros.add(libro);
        }
    }

    // Método para obtener la información de todos los libros
    public String mostrarLibros() {
        StringBuilder infoLibros = new StringBuilder();
        for (Libro libro : libros) {
            infoLibros.append(libro.getInformacion()).append("\n");
        }
        return infoLibros.toString();
    }

    // Método para buscar un libro por título
    public String buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.getInformacion(); // Devuelve la información del libro encontrado
            }
        }
        return "Libro no encontrado: " + titulo; // Mensaje si no se encuentra el libro
    }

    // Método para obtener la lista de libros prestados
    public ArrayList<Libro> obtenerLibrosPrestados(boolean prestado) {
        ArrayList<Libro> librosPrestados = new ArrayList<>();
        ArrayList<Libro> librosNoPrestados = new ArrayList<>();
        
        for (Libro libro : libros) {
            if (libro.estaPrestado()==prestado) { // Verifica si el libro está prestado 
                librosPrestados.add(libro);
            } else{ //
                librosNoPrestados.add(libro);
            }
        }
        return librosPrestados;
    }



    // Método toString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca con los siguientes libros:\n");
        for (Libro libro : libros) {
            sb.append(libro.getInformacion()).append("\n");
        }
        return sb.toString();
    }
}