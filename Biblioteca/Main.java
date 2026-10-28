
package Biblioteca;

public class Main {
    public static void main(String[] args) {

        Prestamo prestamo = new Prestamo("28/10/2026");

        // Creamos los 20 libros
        Libro[] libros = {
            new Libro("Programacion Orientada a Objetos"),
            new Libro("Java desde Cero"),
            new Libro("C++ para Principiantes"),
            new Libro("Estructuras de Datos"),
            new Libro("Algoritmos de Programacion"),
            new Libro("Bases de Datos"),
            new Libro("Desarrollo de Software"),
            new Libro("Logica de Programacion"),
            new Libro("Ingenieria de Software"),
            new Libro("Fundamentos de Informatica"),
            new Libro("Programacion Web"),
            new Libro("Sistemas Operativos"),
            new Libro("Redes de Computadoras"),
            new Libro("Matematica Discreta"),
            new Libro("Calculo Diferencial"),
            new Libro("Fisica General"),
            new Libro("Inteligencia Artificial"),
            new Libro("Seguridad Informatica"),
            new Libro("Desarrollo Movil"),
            new Libro("Arquitectura de Computadoras")
        };

        // Procesamos el préstamo de cada libro
        for (int i = 0; i < libros.length; i++) {
            prestamo.procesarPrestamo(libros[i]);
        }

        // Intentamos prestar nuevamente el primer libro
        System.out.println(
            "\n--- Intentando prestar el primer libro de nuevo ---"
        );

        prestamo.procesarPrestamo(libros[0]);
    }
}
