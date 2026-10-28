package Biblioteca;

// Tema de esta biblioteca: Programación
public class Libro {
    String nombre;
    String escritor;
    int paginas;
    boolean disponible;

    // Constructor: crea un libro disponible por defecto
    public Libro(String nombre, String escritor, int paginas) {
        this.nombre = nombre;
        this.escritor = escritor;
        this.paginas = paginas;
        this.disponible = true;
    }

    // Método que Prestamo invocará (colaboración entre clases)
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("  -> Libro prestado: \"" + nombre + "\" de " + escritor);
        } else {
            System.out.println("  -> No se puede prestar: \"" + nombre + "\" ya está prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("  -> Libro devuelto: \"" + nombre + "\"");
    }

    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("- " + nombre + " | " + escritor + " | " + paginas + " | " + estado);
    }
}
