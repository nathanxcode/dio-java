import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int y = scan.nextInt();

        try {
            contando(x, y);
        } catch (ParametrosInvalidosException ex) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        scan.close();
    }

    static void contando(int x, int y) throws ParametrosInvalidosException {

        if (y > x) {
            throw new ParametrosInvalidosException();
        }

        int counter = x - y;

        for (int a = 1; a <= counter; a++) {
            System.out.println("Imprimindo o numero " + a);
        }

    }
}
