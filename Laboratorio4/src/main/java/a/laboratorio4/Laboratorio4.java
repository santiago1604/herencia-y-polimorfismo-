
package a.laboratorio4;

import javax.swing.JOptionPane;

public class Laboratorio4 {

    public static void main(String[] args) {
       
        //Instancio 
        
        
        Cliente1 cli1 = new Cliente1();
        Cliente2 cli2 = new Cliente2();
        
        JOptionPane.showMessageDialog(null, "La suma es: "+ cli1.suma1);
        JOptionPane.showMessageDialog(null, "La resta es: "+ cli1.resta1);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ cli1.multiplicacion1);
        JOptionPane.showMessageDialog(null, "La division es: "+ cli1.division1);
        JOptionPane.showMessageDialog(null, "La raiz es: "+ cli1.raizCuadrada1);
        
        JOptionPane.showMessageDialog(null, "Resultados del cliente 2");
        
        JOptionPane.showMessageDialog(null, "La suma es: "+ cli2.suma2);
        JOptionPane.showMessageDialog(null, "La resta es: "+ cli2.resta2);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ cli2.multiplicacion2);
        JOptionPane.showMessageDialog(null, "La division es: "+ cli2.division2);
        JOptionPane.showMessageDialog(null, "La raiz es: "+ cli2.raizCuadrada2);
        
    }
        
}

