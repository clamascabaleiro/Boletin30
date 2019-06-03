

package Boletin30;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin30 {

 
      public static ArrayList integrantes = new ArrayList();

    public static void main(String[] args) {
        
        ArrayList<SeleccionFutbol> selec=new ArrayList<>();
        SeleccionFutbol Futbolista=new Futbolista(10,"Extremo Derecho",1,31,"Iago","Aspas");
        SeleccionFutbol Entrenador=new Entrenador(1,2,54,"Fran","Escribá");
        SeleccionFutbol Masajista=new Masajista("fisioterapeuta",6,3,52,"Juan José","Garcia Cota");
        Futbolista.concentrarse();
        Entrenador.concentrarse();
        Masajista.concentrarse();
        selec.add(Futbolista);
        selec.add(Entrenador);
        selec.add(Masajista);
        for(SeleccionFutbol f: selec){
            JOptionPane.showMessageDialog(null,f);
        }
    }
    
}
