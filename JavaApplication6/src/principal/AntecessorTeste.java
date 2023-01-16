
package principal;

import java.util.Scanner;
/**
 * @author wesly
 */
public class AntecessorTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre com o numero: ");
        int num = sc.nextInt();
        Verifica v = new Verifica(num);
        
    }
    
}
