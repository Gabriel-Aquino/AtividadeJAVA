package atividade1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        int a = 1;
        Funcionario f1 = new Funcionario("Gabriel", 12f, 50f);
        Funcionario f2 = new Funcionario("Zé do Pulo", 20f, (float) 4.50);
        Funcionario f3 = new Funcionario("Paulo Preguiça", 10f, (float) 6.35);
        Funcionario f4 = new Funcionario("Tonin Barca Furada", 40f, (float) 13.80);
        
        System.out.println(f1.getNome()+" Trabalha "+f1.getHoras()+"/h e o valor da hora é "+f1.getValor()+
                " E o Salario é: "+f1.Calculo());
        System.out.println(f2.getNome()+" Trabalha "+f2.getHoras()+"/h e o valor da hora é "+f2.getValor()+
                " E o Salario é: "+f2.Calculo());
        System.out.println(f3.getNome()+" Trabalha "+f3.getHoras()+"/h e o valor da hora é "+f3.getValor()+
                " E o Salario é: "+f3.Calculo());        
        System.out.println(f4.getNome()+" Trabalha "+f4.getHoras()+"/h e o valor da hora é "+f4.getValor()+
                " E o Salario é: "+f4.Calculo());
        
        while (a<4){
        Scanner s = new Scanner(System.in);
        System.out.println("\nNome do Funcionario: ");
        String nome = s.nextLine();
        System.out.println("Horas Trabalhadas: ");
        float hora = s.nextFloat();
        System.out.println("Valor da Hora: ");
        float valor = s.nextFloat();
        
        Funcionario cad = new Funcionario(nome, hora, valor);
        System.out.println(cad.getNome()+" Recebe: "+cad.Calculo()+" por Hora!");
        a++;
        
    }
}
}