package Boletin30;

/**
 *
 * @author clamascabaleiro
 */
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;
    
    

    public Masajista() {
        
    }

      public Masajista(String titulacion, int aniosExperiencia, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
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

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
    public void darMasaje(){
        
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
    

    @Override
    public void concentrarse(){
    System.out.println("O masajista "+ nombre+" "+apellidos + " concentrase");
    }

    @Override
    public void viajar(){}

    @Override
    public void entrenar(){}

    @Override
    public void jugarPartido(){}

    @Override
    public String toString() {
        return super.toString() + "Titulacion= " + titulacion + "\nAniosExperiencia= " + aniosExperiencia;
    }
}
