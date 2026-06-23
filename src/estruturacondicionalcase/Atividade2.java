package estruturacondicionalcase;

import java.util.Objects;
import java.util.Scanner;

public class Atividade2 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite a operação");
        System.out.println(" (A) adição, (S) subtração, " +
                "(M) multiplicação ou (D) divisão");
        String operacao = scanner.next();
        operacao = operacao.toUpperCase();

        Integer soma = null;
        switch (operacao) {
            case "A":
                soma = numero1 + numero2;
                break;
            case "S":
                soma = numero1 - numero2;
                break;
            case "M":
                soma = numero1 * numero2;
                break;
            case "D":
                if (numero2 != 0) {
                    soma = numero1 / numero2;
                } else {
                    System.out.println("Não é possível dividir por zero");
                }
                break;
            default:
                System.out.println("Valor inválido");
        }
        if (soma != null) {
            System.out.println("A soma é: " + soma);
        }

    }
}
