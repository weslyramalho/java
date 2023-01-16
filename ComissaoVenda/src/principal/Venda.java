
package principal;

/**
 *
 * @author wesly
 */
public class Venda {
    private int quantidadeItens;
    private Vendedor vendedor;
    private Produto produto;
    
    public void geraComissao(Vendedor vendedor, Produto produto, int quantidadeItens){
        System.out.println("Nome do vendedor: "+ vendedor.getNome());
        System.out.println("Codigo do item: "+ produto.getCodigo());
        System.out.println("Preco unitario: "+ produto.getPreco());
        System.out.println("Quantidade vendida: "+ quantidadeItens);
        System.out.println("Total da comissao: "+ quantidadeItens*(produto.getPreco()*0.05));
    }
}
