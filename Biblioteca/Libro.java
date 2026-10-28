
package Biblioteca;

public class Libro {
    String titulo;
    boolean ocupado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.ocupado = false;
    }

    public void prestar() {
        if (ocupado == false) {
            ocupado = true;
            System.out.println("El libro '" + titulo
                    + "' ha sido prestado");
        } else {
            System.out.println("Lo siento, el libro '" + titulo
                    + "' ya esta ocupado.");
        }
    }
}
