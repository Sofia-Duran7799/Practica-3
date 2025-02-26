public class Autor {
    //La clase autor tiene 3 atributos
    private int id;
    private String nombre;
    private String correoElectronico;

    public Autor(int id, String nombre, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Autor[Nombre: " + nombre + ", Correo: " + correoElectronico + "]";
    }
}
