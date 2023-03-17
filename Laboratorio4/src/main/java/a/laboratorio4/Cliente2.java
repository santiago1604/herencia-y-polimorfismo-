
package a.laboratorio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class Cliente2 {
   
    CalculadoraEspecial especial = new CalculadoraEspecial();
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cliente 2 Por favor Digite el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor Digite el Segundo numero"));

        int suma2 = especial.sumarEnteros(numero1, numero2);
        int resta2 = especial.restarEnteros(numero1, numero2);
        int multiplicacion2 = especial.multiplicarEnteros(numero1, numero2);
        double division2 = especial.dividirEnteros(numero1, numero2);
        double raizCuadrada2 = especial.calcularRaiz(numero1);

        
        
}
