
package pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private int codigo;
    private Date data;
    private List<ItemPedido> itens;

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public static void main(String[] args) {
       Produto sabao = new Produto();
       sabao.setCodigo(1);
       sabao.setDescricao("Sabão em Barra");
       sabao.setValorUnitario(5.35);
       
       Produto amaciante = new Produto();
       amaciante.setCodigo(2);
       amaciante.setDescricao("Amacianete");
       amaciante.setValorUnitario(3.5);
       
       Pedido pedido = new Pedido();
       pedido.setCodigo(1);
       pedido.setData(new Date());
       pedido.setItens(new ArrayList<ItemPedido>());
       
       ItemPedido itens = new ItemPedido();
       itens.setProduto(sabao);
       itens.setQuantidade(10);
       itens.setValorUnitario(sabao.getValorUnitario());
       pedido.getItens().add(itens);
       
       itens.setProduto(amaciante);
       itens.setQuantidade(5);
       itens.setValorUnitario(amaciante.getValorUnitario());
       pedido.getItens().add(itens);
       
       System.out.println(pedido.toString());
       
    }
    
}
