public class Cliente {
    // VARIABLES
    private String nombre;
    private String apellido;
    private int documento;
    private Cuenta Cuenta;

    // CONSTRUCTOR
    Cliente(String nombre, String apellido, int documento, Cuenta Cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.Cuenta = Cuenta;
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Cuenta Cuenta) {
        this.Cuenta = Cuenta;
    }

    @Override
    public String toString() {
        return "\n\nNombre: " + nombre + "\nApellido: " + apellido + "\nDocumento: " + documento + "\n" + Cuenta;
    }
}
