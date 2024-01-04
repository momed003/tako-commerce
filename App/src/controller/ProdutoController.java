
package controller;

import model.Categoria;
import model.Produto;

/**
 *
 * @author momed003
 */
public class ProdutoController {
    private Produto produto=new Produto();
    public void criarProduto(String referencia,int barCode,Categoria categoria,double price, String description ){
        produto.setReference(referencia);
        produto.setBarCode(barCode);
        produto.setCategoria(categoria);
        produto.setDiscount(0.0);
        produto.setPrice(price);
        produto.setDescription(description);
      
    }
    public void eliminarProduto(){}
    public void alterarProduto(){}
    public void historicoProduto(){}
    
}
