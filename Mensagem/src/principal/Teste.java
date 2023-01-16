
package principal;

import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre com a mesagem: ");
        LeEntrada ler = new LeEntrada(sc.nextLine());
    }
}
