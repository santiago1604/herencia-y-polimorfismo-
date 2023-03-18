
package com.mycompany.herencia1;
import javax.swing.JOptionPane;

public class SistemaInformacion {

    //Constructor de la clase
    public SistemaInformacion() {
    }
    
   
    public static void main(String[] args) {
       
        int opcion = 0;
        Persona sistemaInformacion = new Persona();
        try{
           
            do {                
                opcion =sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado\n 2 para procesar los datos del estudiante\n 3 para salir: ");
                if(opcion == 1){
                    JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
                    Empleado manejadorEmpleado = new Empleado();
                    //Leemos los datos
                    manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
                    //Mostramos el reporte de datos
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();
                }else if(opcion == 2){
                    JOptionPane.showMessageDialog(null, "Procesando datos del estudiante");
                    Estudiante manejadorEstudiante = new Estudiante();
                    //Leemos los datos del estudiante
                    manejadorEstudiante.ingresarDatosEstudiante();
                    //Mostramos el reporte de notas
                    manejadorEstudiante.imprimirReporteNotasEstudiante();
                }else if(opcion == 3){
                    JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,"Opción inválida");
                }
            } while (opcion <= 1 || opcion >= 3);
        }catch(Exception errorMain){
            JOptionPane.showMessageDialog(null,"Error en la digitación: "); 
            errorMain.printStackTrace();
        }
    }    
    
}
    

