import java.util.Scanner;

public class ContaTerminal{
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        // TODO: Exibir  as mensagens para o usuário
        System.out.println("Projeto Conta Bancária");
        System.out.println("Por favor, digite o seu nome!");
        // TODO: Obter pelo scanner os valores digitados pelo terminal
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        conta.agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        conta.numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número saldo da Conta!");
        conta.saldo = scanner.nextDouble();
                

        //TODO: Exibir a mensagem da conta criada 
        String textoFinal = "";
        textoFinal = textoFinal.concat("Olá ");
        textoFinal = textoFinal.concat(conta.nomeCliente );
        textoFinal = textoFinal.concat(" obrigado por criar uma conta em nosso banco, sua agência é ");
        textoFinal = textoFinal.concat(conta.agencia);       
        textoFinal = textoFinal.concat(" conta ");
        // Convertendo de int para String
        String numeroConta = String.valueOf(conta.numero);
        textoFinal = textoFinal.concat(numeroConta);
        textoFinal = textoFinal.concat(" e seu saldo R$ ");
        // Convertendo de Double para String
        String saldoString = String.valueOf(conta.saldo);
        textoFinal = textoFinal.concat(saldoString);
        textoFinal = textoFinal.concat(" já está disponível para saque");
        
        System.out.println(textoFinal);    
        
        scanner.close();
    }
}
