package desafio_dio_banco;

public class ContaPoupanca extends Conta {
    
    public void debito(double valor) {
        
        this.saldo = this.saldo - valor;
        
    }
    
    public String toString() {
        return "Conta Poupan�a:\nN�mero: " + Integer.toString(this.agencia) + 
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------";
    }
    
}
