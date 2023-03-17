
package a.laboratorio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class Cliente1 {
    
    
    
    CalculadoraNormal Normal = new CalculadoraNormal();
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cliente 1 Por favor Digite el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor Digite el Segundo numero"));

        int suma1 = Normal.sumarEnteros(numero1, numero2);
        int resta1 = Normal.restarEnteros(numero1, numero2);
        int multiplicacion1 = Normal.multiplicarEnteros(numero1, numero2);
        double division1 = Normal.dividirEnteros(numero1, numero2);
        double raizCuadrada1 = Normal.calcularRaiz(numero1);

       
        
        
}