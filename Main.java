/**
 * Clase Main para probar la funcionalidad de las clases Libro y Biblioteca.
 * 
 * @author (tu nombre)
 * @version (una versión o fecha)
 */
public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear al menos 3 objetos Libro
        Libro libro1 = new Libro("Crimen y castigo", "Fyodor Dosto", "978-0307474728", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935", 1949);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-0156012195", 1943);

        // Añadir los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar la información de todos los libros en la biblioteca
        System.out.println("=== Libros en la biblioteca ===");
        System.out.println(biblioteca.mostrarLibros());

        // Buscar un libro por título y mostrar su información
        System.out.println("=== Buscar libro por título ===");
        String tituloBusqueda = "1984"; // Cambia este valor para buscar otro libro
        System.out.println("Buscando el libro: " + tituloBusqueda);
        System.out.println(biblioteca.buscarLibroPorTitulo(tituloBusqueda));

        // Buscar un libro que no existe
        String tituloNoExistente = "Don Quijote";
        System.out.println("Buscando el libro: " + tituloNoExistente);
        System.out.println(biblioteca.buscarLibroPorTitulo(tituloNoExistente));
    }
}
