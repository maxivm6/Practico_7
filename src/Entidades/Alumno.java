package Entidades;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    protected int legajo;
    protected String apellido;
    protected String nombre;
    protected HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo=legajo;
        this.apellido=apellido;
        this.nombre=nombre;
        this.materias=new HashSet();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {
        if (materias.contains(m)) {
            JOptionPane.showMessageDialog(null, "Ya esta inscripto en "+m.getNombre());
        }
        else {
            materias.add(m);
            JOptionPane.showMessageDialog(null, "Ha sido inscripto a "+m.getNombre());
        }
    }

    public int cantidadMaterias() {
        int cantidad = materias.size();
        return cantidad;
    }

    @Override
    public String toString() {
        return apellido+", "+nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
}
