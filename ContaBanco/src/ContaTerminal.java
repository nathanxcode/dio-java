import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nomeCliente;
        double saldo;
        // TODO:
        // make a simple interface, that get the user data and show at the end
        System.out.println("Por favor, digite o numero da Agencia!");
        Scanner sc = new Scanner(System.in);
        numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite a sua Agencia!");
        Scanner sc1 = new Scanner(System.in);
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        Scanner sc2 = new Scanner(System.in);
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo!");
        Scanner sc3 = new Scanner(System.in);
        saldo = Double.parseDouble(sc.nextLine());
        sc.close();
        sc1.close();
        sc2.close();
        sc3.close();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia
                        + ", conta " + numero + ", e saldo " + saldo + " ja esta disponival para saque! ");
    }

}
