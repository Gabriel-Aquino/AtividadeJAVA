package associacao;

public class Pedido {
    Produtos produto[] = new Produtos[3];

public void adicionarProduto(){
    Produtos p = new Frios();
    p.setPreco(110);
    p.setQuantidade(3);
    produto[0] = p;
    p = new Paozinho();
    p.setPreco(50);
    p.setQuantidade(10);
    produto[1] = p;
    p = new Doces();
    p.setPreco(30);
    p.setQuantidade(30);
    produto[2] = p;
    }
public void calcularProduto(){
    double total = 0.0;
    for(int i=0; i<produto.length; i++){
        System.out.println("Produto: "+produto[i].getPreco()+"Quantidade: "+produto[i].getQuantidade()+
                "Total: "+produto[i].getPreco()*produto[i].getQuantidade());
        
        total+=produto[i].getPreco()*produto[i].getQuantidade();
        
        System.out.println("Total do Pedido: "+total);
}
    }
}

