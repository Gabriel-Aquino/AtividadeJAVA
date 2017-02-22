package atividade1;
public class Funcionario {
    private String nome;
    private float horas;
    private float valor;

    public Funcionario(String n, float h, float v){
        this.nome = n;
        this.horas = h;
        this.valor = v;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    } 
    float Calculo(){
        float salario = this.getValor() * this.getHoras();
        return (salario);
    }
}
