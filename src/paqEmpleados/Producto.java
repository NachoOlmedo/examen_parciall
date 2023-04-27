package paqEmpleados;

public class Producto {
    protected int identificador;
    protected String nombre;
    protected float precio;
    protected int stock;
    protected String codProveedor;

    public Producto(int identificador, String nombre, float precio, int stock, String codProveedor) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codProveedor = codProveedor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public boolean igual(Producto p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        return this.identificador == p.identificador;
    }

}
