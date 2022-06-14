import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        double valor = 0f;
        String opcao;
        ContaCorrente conta = null;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao banco Davi_PX.");
        do {
            System.out.println("\nOpcoes:");

                System.out.println("[A] Sacar.");
            if (conta != null) {
                System.out.println("[B] Depositar.");
                System.out.println("[C] Saldo da conta.");
                System.out.println("[D] Criar uma nova conta corrente.");
            }
            System.out.println("[E] Sair.");
            System.out.println("Escoha uma opção e pressione ENTER: ");
            
            opcao = ler.next();
    
            if(opcao.toUpperCase().compareTo("A") == 0) {
                if (conta == null) {
                    conta = new ContaCorrente();
                    
                    ler.nextLine();
                    System.out.println("Nome:");
                    conta.senha = ler.nextLine();
                    
                    System.out.println("Tipo do documento (CPF):");
                    conta.senha = ler.nextLine();
                    
                    System.out.println("Idade:");
                    conta.numeroConta = ler.nextInt();
                    
                    System.out.println("Salario:");
                    conta.saldo = ler.nextInt();
                    ler.nextLine();

                    System.out.println("Numero da conta:");
                    conta.numeroConta = ler.nextInt();
                    
                    System.out.println("Agencia da conta:");
                    conta.agencia = ler.nextInt();

                    System.out.println("Saldo da conta:");
                    conta.saldo = ler.nextInt();
                    ler.nextLine();
                    
                    System.out.println("Senha da conta:");
                    conta.senha = ler.nextLine();

                    conta.ativa = true;
                    
                    System.out.println("Conta criada com sucesso.");
                } else {
                    System.out.println("A conta ja foi criada.");
                }
            }
            else if(opcao.toUpperCase().compareTo("B") == 0){
                if (conta != null) {
                    System.out.println("Digite um valor em R$ a ser sacado na conta:");
                    valor = ler.nextDouble();
    
                    if (valor <= conta.saldo) {
                        conta.sacar(valor);
                        System.out.println("Saque realizado.\nSaldo apos saque: R$ "+conta.saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
            }
            
            else if(opcao.toUpperCase().compareTo("C") == 0){

                if (conta != null) {
                    System.out.println("Digite um valor em R$ a ser depositado na conta:");
                    valor = ler.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Deposito Realizado.\nSaldo apos deposito: R$"+conta.saldo);
                }

            }
            else if(opcao.toUpperCase().compareTo("D") == 0){

                if (conta != null) {
                    System.out.println("Saldo da conta: R$"+conta.saldo);
                }

            }
            else if(opcao.toUpperCase().compareTo("E") == 0){
                System.out.println("Ate a proxima");
            }
            else {
                System.out.println("Opcao invalida!");
            }
        } while (opcao.toUpperCase().compareTo("E") != 0);

        ler.close();
    }
}
