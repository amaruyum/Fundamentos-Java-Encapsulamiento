package dominio;

public class Persona {
    private String nombre;
    private Double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, Double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //Get para recuperar informacion
    //Set para modificar la informacion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    // to string => nos permite imprimir el estado del objeto en cualquier momento
    public String toString(){
        return "Persona nombre: "+this.nombre+", sueldo: "+this.sueldo+",eliminado: "+this.eliminado;
    }
}
