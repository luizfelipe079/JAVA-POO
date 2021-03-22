package ProjetoBanco;

import java.util.Scanner;

public class UsandoBanco {
    public static void main(String[] args) {
        
        String t;
        Banco b1 = new Banco();
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Olá! Bem Vindo ao Banco Vermelho");
        System.out.println("Qual seu nome ?");
        b1.setNome(leia.next());
   
       
        System.out.println("Que tipo de conta deseja abrir ?");
        System.out.println("Digite cc para conta corrente e cp para conta poupança");
        t = leia.next();
        while(!"cp".equals(t) && !"cc".equals(t)){
            System.out.println("ERRO! Tipo de conta inválida!");
            System.out.println("Digite um tipo válido!");
            t = leia.next();
        }
        System.out.println(b1.getTipoConta());
         
        
        b1.abrirConta(t);
        //b1.setValor(10);
        //b1.sacar();
        
        
        
        b1.status();
        b1.fecharConta();
        
        
    }
}
