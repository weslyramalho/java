
package principal;

/**
 *
 * @author wesly
 */
public class Teste {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("alex");
        Produto p1 = new Produto(25, 5);
        Venda v = new Venda();
        v.geraComissao(v1, p1, 5);
     
    }
}
