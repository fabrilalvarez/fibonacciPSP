/**
 * Crea un hilo que realice el cálculo de los primeros N números de la sucesión
 * de fibonacci. La sucesión de fibonacci comienza con los números 1 y 1 y el
 * siguiente elemento es la suma de los dos elementos anteriores. Así la
 * sucesión de fibonacci sería 1,1,2,3,5,8,11,19,30,49 el parámetro N será
 * indicado cuando se llame al constructor de la clase thread correspondiente.
 */
package fibonacci;

/**
 *
 * @author Fran
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serieFibonacci primerIntento = new serieFibonacci();
        primerIntento.start();
    }

}
