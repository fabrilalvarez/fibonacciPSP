package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class serieFibonacci extends Thread {

    int n, fibo1 = 1, fibo2 = 1;

    public serieFibonacci() {
    }

    public serieFibonacci(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        do {
            setN();
        } while (n <= 1);
        fibonacci();
    }

    public int getN() {
        return n;
    }

    public void setN() {
        n = Integer.valueOf(JOptionPane.showInputDialog("Inserta un numero mayor que 1"));
    }

    public void fibonacci() {
        System.out.print(fibo1 + ", ");
        for (int i = 2; i <= n; i++) {
            System.out.print(fibo2 + ", ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
    }

}
