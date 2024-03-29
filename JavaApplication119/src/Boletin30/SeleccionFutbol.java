package Boletin30;

/**
 *
 * @author clamascabaleiro
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
     public SeleccionFutbol() {
         
    }

    public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Id= " + id + "\nEdad= " + edad + "\nNombre= " + nombre + "\nApellidos= " + apellidos + "\n";
    }
}
