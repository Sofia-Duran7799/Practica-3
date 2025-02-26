import java.util.*;

/**
 * Clase Main para probar la funcionalidad de las clases Libro y Biblioteca.
 * 
 * @author ASDB
 * @version 26/02/2025
 */
public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear objetos Autor
        Autor autor1 = new Autor(1, "Fyodor Dostoevsky", "fyodor@dosto.com");
        Autor autor2 = new Autor(2, "George Orwell", "george@orwell.com");
        Autor autor3 = new Autor(3, "Antoine de Saint-Exupéry", "antoine@desaint.com");

        // Crear al menos 3 objetos Libro
        Libro libro1 = new Libro("Crimen y castigo", autor1, "978-0307474728", 1967);
        Libro libro2 = new Libro("1984", autor2, "978-0451524935", 1949);
        Libro libro3 = new Libro("El Principito", autor3, "978-0156012195", 1943);

        // Añadir los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Prestar algunos libros
        libro1.prestar();
        libro3.prestar();

        // Mostrar la información de todos los libros en la biblioteca
        System.out.println("=== Libros en la biblioteca ===");
        System.out.println(biblioteca.mostrarLibros());

        // Obtener y mostrar libros prestados
        System.out.println("=== Libros prestados ===");
        ArrayList<Libro> librosPrestados = biblioteca.obtenerLibrosPrestados(true);
        for (Libro libro : librosPrestados) {
            System.out.println(libro.getInformacion());
        }

        // Obtener y mostrar libros no prestados
        System.out.println("=== Libros no prestados ===");
        ArrayList<Libro> librosNoPrestados = biblioteca.obtenerLibrosPrestados(false);
        for (Libro libro : librosNoPrestados) {
            System.out.println(libro.getInformacion());
        }
    }
}