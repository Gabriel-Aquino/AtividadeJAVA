
package facul01;

public class Facul01 {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta("12345", 0);
        
        conta.creditar(20);
        conta.debitar(10);
        
       conta.imprimir();
        
        Conta c2 = new Conta(ContaX.numero);
        
        c2.saldo = -10;
        
        c2.creditar(100);
        
       c2.imprimir();
       
       Conta c3 = new Conta();
       
       Empregado emp = new Empregado();
       
       emp.CPF = 280305;
       emp.n_func = 11111;
       emp.nome = "Gabriel";
       emp.sexo = "M";
       
       emp.imprimirdado();
    }
    
}
