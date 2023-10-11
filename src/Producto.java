public class Producto {

    private int id;

    private String nombre;

    private int precio;

    private boolean enDescuento;

    public Producto(int id, String nombre, int precio, boolean enDescuento) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.enDescuento = enDescuento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isEnDescuento() {
        return enDescuento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEnDescuento(boolean enDescuento) {
        this.enDescuento = enDescuento;
    }
}
