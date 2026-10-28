package Biblioteca;

public class Prestamo {
    String fecha;

    public Prestamo(String fecha) {
        this.fecha = fecha;
    }

    public void procesarPrestamo(Libro unLibro) {
        System.out.println("Registrando prestamo en la fecha: "
                + fecha);

        // Colaboracion entre clases
        unLibro.prestar();
    }
}
