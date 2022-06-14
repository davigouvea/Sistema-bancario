public class ContaCorrente {
    
    int numeroConta;
    int agencia;
    String documento;
    String senha;
    boolean ativa;
    double saldo;

    void depositar(double valor){
        saldo=saldo+valor;
    }

    void sacar(double valor){
        saldo = saldo - valor;
    }
}