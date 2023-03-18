
package com.mycompany.herencia1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    ArrayList<String> arrayList = new ArrayList<String>();

    private String  carnet;
    private int numMaterias;
    private double promedioNotas;

    public Estudiante() {
    }
    
   public Estudiante(String carnet,  int numeroMaterias, double notas) {
        this.carnet = carnet;
        this.numMaterias = numeroMaterias;
        this.promedioNotas = notas;
        
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
   
    public double calcularPromedio(){
        double promedio = 0.0;
        for(int i = 0; i <= arrayList.size()-1; i++){
            promedio  = (promedio + Double.parseDouble(arrayList.get(i))) / (arrayList.size()-1);
        }
        return promedio;
    }
    
    public void leerNotasEstudiante(){
        int contador = 0;
        while(contador < numMaterias){
            arrayList.add(JOptionPane.showInputDialog(null, "Digite la nota"));
            contador++;
        }
    }
    public void ingresarDatosEstudiante(){
        String nombre;
        String apellido;
        
        int edad = 0;
        double peso = 0.0;
        
        nombre = leerDatoTipoCadena("Ingrese Nombre: ");
        apellido = leerDatoTipoCadena("Ingrese Apellido: ");
        edad = leerDatoTipoEntero("Ingrese Edad: ");
        peso = leerDatoTipoReal("Ingrese Peso: ");
        carnet = JOptionPane.showInputDialog(null, "Por favor ingrese su numero de carbet");
        numMaterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de materias que esta viendo"));
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setPeso(peso);
        leerNotasEstudiante();
    }
    
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "el numero de su carnet es: "+carnet+"\n Su cantidad de materias es: "+numMaterias+"\nSu promedio es: "+calcularPromedio());
    }

    
}
    

