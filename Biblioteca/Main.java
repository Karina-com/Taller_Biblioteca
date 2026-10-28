package Biblioteca;

public class Main {
    public static void main(String[] args) {

        System.out.println("##### BIBLIOTECA: PROGRAMACIÓN #####\n");

        // 1. Creamos 10 objetos (instancias) de la clase Libro
        Libro libro1  = new Libro("Clean Code", "Robert C. Martin", 464);
        Libro libro2  = new Libro("The Pragmatic Programmer", "Andrew Hunt", 352);
        Libro libro3  = new Libro("Head First Java", "Kathy Sierra", 416);
        Libro libro4  = new Libro("Effective Java", "Joshua Bloch", 320);
        Libro libro5  = new Libro("Design Patterns", "Erich Gamma", 448);
        Libro libro6  = new Libro("Refactoring", "Martin Fowler", 395);
        Libro libro7  = new Libro("Code Complete", "Steve McConnell", 272);
        Libro libro8  = new Libro("Introduction to Algorithms", "Thomas H. Cormen", 488);
        Libro libro9  = new Libro("The Clean Coder", "Robert C. Martin", 336);
        Libro libro10 = new Libro("Java: The Complete Reference", "Herbert Schildt", 256);

        // Los agrupamos en un arreglo para recorrerlos fácilmente
        Libro[] biblioteca = {
            libro1, libro2, libro3, libro4, libro5,
            libro6, libro7, libro8, libro9, libro10
        };

        System.out.println("===== CATÁLOGO INICIAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }

        // 2. Creamos préstamos y les pasamos un objeto Libro completo
        System.out.println("\n===== PRÉSTAMOS =====");
        Prestamo prestamo1 = new Prestamo("03/11/2026");
        prestamo1.procesarPrestamo(libro2);

        Prestamo prestamo2 = new Prestamo("04/11/2026");
        prestamo2.procesarPrestamo(libro5);

        Prestamo prestamo3 = new Prestamo("05/11/2026");
        prestamo3.procesarPrestamo(libro10);

        // Intento de prestar un libro que ya está prestado
        Prestamo prestamo4 = new Prestamo("06/11/2026");
        prestamo4.procesarPrestamo(libro5);

        // 3. Devolución
        System.out.println("\n===== DEVOLUCIONES =====");
        libro10.devolver();

        System.out.println("\n===== CATÁLOGO FINAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }
    }
}
