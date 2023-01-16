
package principal;

import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class SomaMediaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        double a = sc.nextDouble();
        System.out.printf("Digite o segundo numero: ");
        double b = sc.nextDouble();
        System.out.printf("Digite o terceiro numero: ");
        double c = sc.nextDouble();
        Executa e = new Executa(a,b,c);
    }
}
