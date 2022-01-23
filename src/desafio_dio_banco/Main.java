package desafio_dio_banco;

public class Main {
	public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alexandre", "93580843087");
        
        ContaCorrente corrente1 = new ContaCorrente();
        corrente1.criarConta(cliente1, 0);
        
        System.out.println(corrente1);
        corrente1.credito(500);
        
        System.out.println(corrente1);
        corrente1.debito(100);
        
        System.out.println(corrente1);
               
        ContaPoupanca poupanca1 = new ContaPoupanca();
        System.out.println(poupanca1);
        
        poupanca1.criarConta(cliente1, 0);
        System.out.println(poupanca1);
       
        poupanca1.credito(500);
        System.out.println(poupanca1);
       
        poupanca1.debito(100);
        System.out.println(poupanca1);
        poupanca1.transferirParaAConta(100, corrente1);
       
        System.out.println(corrente1);
        System.out.println(poupanca1);
        corrente1.transferirParaAConta(100, poupanca1);
        System.out.println(corrente1);
        System.out.println(poupanca1);
    }
    
}