

package lab5_angelt;

import java.util.ArrayList;


public class Escuadron {
    
    private String nombre, localidad, lema, tipo;

    private ArrayList<Being> miembros = new ArrayList();

    public Escuadron() {
    }
    

    public Escuadron(String nombre, String localidad, String lema, String tipo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lema = lema;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Being> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Being> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return nombre + "  " + localidad;
    }
    

}
