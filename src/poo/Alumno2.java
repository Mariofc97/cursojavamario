package poo;

public class Alumno2 {
    private String nombre;
    private String codigo;
    private double notaMedia;

    public Alumno2(String nombre, String codigo, double notaMedia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.notaMedia = notaMedia;
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public double getNotaMedia() { return notaMedia; }

    @Override
    public String toString() {
        return "Alumno2{nombre='" + nombre + "', codigo='" + codigo + "', notaMedia=" + notaMedia + "}";
    }
}
