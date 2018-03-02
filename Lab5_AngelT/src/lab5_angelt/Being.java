

package lab5_angelt;


public class Being {
    
    protected String nombre, poder, debilidad;
    protected String squad;
    protected int fuerza, fisica, mental;

    public Being() {
    }

    
    
    public Being(String nombre, String poder, String debilidad, String squad, int fuerza, int fisica, int mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.squad = squad;
        this.fuerza = fuerza;
        this.fisica = fisica;
        this.mental = mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    @Override
    public String toString() {
        return "Being{" + "nombre=" + nombre + ", poder=" + poder + '}';
    }


}
