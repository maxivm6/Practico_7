package Main;
import Entidades.Alumno;
import Entidades.Materia;

public class Colegio {
   
    public static void main(String[] args) {
        
        Materia ingles = new Materia(448613,1,"Ingles I");
        Materia matematica = new Materia(115468,1,"Matematicas I");
        Materia lab = new Materia(887468,1,"Laboratorio I");
        
        Alumno a1 = new Alumno (1001,"Lopez","Martin");
        Alumno a2 = new Alumno (1002,"Martinez","Brenda");
        
        a1.agregarMateria(lab);
        a1.agregarMateria(ingles);
        a1.agregarMateria(matematica);
        a2.agregarMateria(lab);
        a2.agregarMateria(ingles);
        a2.agregarMateria(matematica);
        a2.agregarMateria(lab);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
        
    }
    
}
