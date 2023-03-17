
package a.laboratorio4;
/**
 *
 * @author Brayan
 */
public class CalculadoraNormal implements InterfazCalculadora {
     @Override
    public int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    @Override
    public double dividirEnteros(int numero1, int numero2) {
        return (numero1 / numero2);
    }

    @Override
    public double calcularRaiz(int numero1) {
        return Math.sqrt(numero1);
    }
}
