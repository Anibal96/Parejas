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
    private ArrayList<String> alumnos;

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
        alumnos.add("pepito");
    }

    /**
     * Método que empareja los alumnos mediante un numero identificativo.
     */
    public void hacerParejas ()
    {
        Collections.shuffle(alumnos);
        boolean pareja = true;
        int cont = 0;
        if ((alumnos.size() % 2) == 0){
            for(String alumno : alumnos){
                if (pareja){
                    cont++;
                    pareja = false;
                }
                else{
                    pareja = true;
                }
                String nAsig = "%02d";
                String resultado = String.format(nAsig,cont);
                System.out.println("00" + resultado + alumno);
            }
        }
        else{
            for(String alumno : alumnos){
                if (cont == (alumnos.size()/2)){
                    
                }
                else if(pareja){
                    cont++;
                    pareja = false;
                }
                else{
                    pareja = true;
                }
                String nAsig = "%02d";
                String resultado = String.format(nAsig,cont);
                System.out.println("00" + resultado + alumno);
            }
        }
    }
}
