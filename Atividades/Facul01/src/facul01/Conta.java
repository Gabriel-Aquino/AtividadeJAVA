
package facul01;

public class Conta {
    String numero;
    double saldo;
    
    Conta(String n, double v){
        numero = n;
        saldo = v;
    }
    Conta(String n){
        numero = n;
        saldo = 0;
    }
    Conta(){
        imprimir();
    }
    void creditar (double valor){
        saldo += valor;
    }
    void debitar(double valor){
        saldo -= valor;
    }
    void imprimir(){
        System.out.println("Conta: "+numero);
        System.out.println("Saldo: "+saldo);
    }
}
