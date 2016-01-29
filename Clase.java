import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    //Coleccion que almacena la lista de los alumnos.
    private ArrayList<String> alumnos;
    //Coleccion que almacena la lista de los alumnos por orden en parejas.
    private ArrayList<String> alumnosOrdenados;

    /**
     * Constructor for objects of class Clase
     */
    public Clase()
    {
        alumnos = new ArrayList<String>();
        alumnos.add("Adeva Tranche, Adrián");
        alumnos.add("Aller González, Francisco Javier");
        alumnos.add("Álvarez Prieto, Noelia");
        alumnos.add("Barrionuevo Pérez, Manuel");
        alumnos.add("Bóveda del Río, José Antonio");
        alumnos.add("de la Viuda Crespo, Ignacio");
        alumnos.add("Encina Maestro, David");
        alumnos.add("Felix Nañez, Kevin");
        alumnos.add("Fernández Diez, Daniel");
        alumnos.add("Fernández González, Javier");
        alumnos.add("Fernández Rincón, Jesús");
        alumnos.add("Fuentes Álvarez, Francisco José");
        alumnos.add("García Juárez, David");
        alumnos.add("García Serrano, Rubén");
        alumnos.add("González Álvarez, David");
        alumnos.add("López Beltrán, Víctor");
        alumnos.add("Lora García, Sandra");
        alumnos.add("Melcón Diez, Víctor");
        alumnos.add("Menéndez Pouso, Francisco José");
        alumnos.add("Pérez Bayón, Álvaro");
        alumnos.add("Pradera San José, Daniel");
        alumnos.add("Prieto Mediavilla, Gabriel");
        alumnos.add("Robles González, Miguel Ángel");
        alumnos.add("Sánchez Manzano, Adán");
        alumnos.add("Serrano García, Verónica");
        alumnos.add("Tascón González, Anibal");
    }

    /**
     * Método que empareja los alumnos mediante un numero identificativo.
     */
    public void hacerParejas ()
    {
        Collections.shuffle(alumnos);
        boolean parejaYaFormada = true;
        int cont = 0;
        alumnosOrdenados = new ArrayList<String>();
        for(String alumno : alumnos){
            if (cont == (alumnos.size()/2)){
                parejaYaFormada = false;
            }
            else if(parejaYaFormada){
                cont++;
                parejaYaFormada = false;
            }
            else{
                parejaYaFormada = true;
            }
            System.out.println("00" + String.format("%02d",cont) + alumno);
            alumnosOrdenados.add(alumno);
        }
    }

    /**
     * Método que muestra los nombre de los alumnos que tengan el mismo codigo que introduce el usuario.
     */
    public String nombreAlumnosPareja (int numero)
    {
        String nombreAlumnosConEsteCodigo;
        if (alumnosOrdenados == null){
            nombreAlumnosConEsteCodigo = "Primero tienes que formar las parejas.";
        }
        else{
            int indice = (numero*2);
            if(((indice)+1) == alumnosOrdenados.size()){
                nombreAlumnosConEsteCodigo = (alumnosOrdenados.get(indice-2) + "/" + alumnosOrdenados.get(indice-1) 
                    + "/" + alumnosOrdenados.get(indice));
            }
            else{
                nombreAlumnosConEsteCodigo = (alumnosOrdenados.get(indice-2) + "/" + alumnosOrdenados.get(indice-1));
            }
        }
        return nombreAlumnosConEsteCodigo;
    }
}
