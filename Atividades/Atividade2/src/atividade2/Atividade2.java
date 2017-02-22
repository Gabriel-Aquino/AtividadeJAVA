package atividade2;
public class Atividade2 {
    public static void main(String[] args) {
        Estoque e = new Estoque("Arroz", 100, 1);
        
            System.out.println(e.descricao());
        
        if (e.precisaRepor()==true){
            System.out.println("Precisa repor estoque: ");
        e.repor(5);
            System.out.println("Quantidade reabastecida: "+e.getQt());
        }else{
            System.out.println("Quantidade minima permitida");
        }
        e.darBaixa(10);
            System.out.println("Quantidade reajustada: "+e.getQt());
    }   
    
}
