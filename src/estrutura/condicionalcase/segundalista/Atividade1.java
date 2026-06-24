package estrutura.condicionalcase.segundalista;

import java.util.Scanner;

public class Atividade1 {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em reais");
        double valor = scanner.nextDouble();
        System.out.println("Informe a cotação:");
        System.out.println("• 1: Dólar ");
        System.out.println("• 2: Euro ");
        System.out.println("• 3: Libra ");
        System.out.println("• 4: Peso argentino");
        int cotacao = scanner.nextInt();

        switch (cotacao) {
            case 1 :
                System.out.println("A cotação em dolar é:");
                System.out.println(valor * 0.19);
                break;
            case 2 :
                System.out.println("A cotação em Euro é:");
                System.out.println(valor * 0.17);
                break;
            case 3 :
                System.out.println("A cotação em Libra é:");
                System.out.println(valor * 0.15);
                break;
            case 4 :
                System.out.println("A cotação em  Peso argentino é:");
                System.out.println(valor * 285.71);
                break;
            default:
                System.out.println("Cotação inválida");
        }
    }
}
