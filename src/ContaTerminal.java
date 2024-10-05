import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite a Agência do banco: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite a Conta do banco: ");
        String conta = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);


    }
}
