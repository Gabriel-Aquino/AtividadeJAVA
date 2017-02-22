package atividade2;
public class Estoque {
    private String nome;
    private int qt;
    private int qtm;

    public Estoque(String nome, int qt, int qtm) {
        this.nome = nome;
        if (qt > 0){
        this.qt = qt;
        }
        if(qtm > 0){
        this.qtm = qtm;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public int getQtm() {
        return qtm;
    }

    public void setQtm(int qtm) {
        this.qtm = qtm;
    }
    
    void repor(int qtd){
       int soma = this.getQt();
       soma += qtd;
       this.setQt(soma);
    }
    void darBaixa(int qtd){
        int soma = this.getQt();
       soma -= qtd;
       this.setQt(soma);
    }
    String descricao(){
       String prod = ("Produto: "+this.getNome()+". Quantidade: "+this.getQt()+"."
               + "Quantidade Minima: "+this.getQtm());
       return (prod);
    }
    boolean precisaRepor(){
        return this.getQt() < this.getQtm();
}
}