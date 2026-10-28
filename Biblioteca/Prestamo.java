package Biblioteca;

public class Prestamo {
    String fecha;

    public Prestamo(String fecha) {
        this.fecha = fecha;
    }

    public void procesarPrestamo(Libro unLibro) {
        System.out.println("Registrando préstamo en la fecha: "
                + fecha);

        // Colaboración entre clases
        unLibro.prestar();
    }
}
