package Boletin30;

/**
 *
 * @author clamascabaleiro
 */
public class Entrenador extends SeleccionFutbol {
    private int idFederacion;
    
    public void planificarEntrenamiento(){
        
    }

    public Entrenador() {
        
    }
    
    
 public Entrenador(int idFedereacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.idFederacion = idFedereacion;
    }

    public void setIdFedereacion(int idFedereacion) {
        this.idFederacion = idFedereacion;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdFedereacion() {
        return idFederacion;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    public void planificarEntrenamineto(){}
    
    @Override
    public void concentrarse(){
    System.out.println("O entrenador "+ nombre+" "+apellidos + " concentrase");
    }

    @Override
    public void viajar(){}

    @Override
    public void entrenar(){}

    @Override
    public void jugarPartido(){}

    @Override
    public String toString() {
        return super.toString() + "IdFedereacion= " + idFederacion;
    }
    
}
