package estruturacondicionalcase;

import java.util.Scanner;

public class GrupoA {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Mexico");
                break;
            case 2:
                System.out.println("Coreia do Sul");
                break;
            case 3:
                System.out.println("Tchéquia");
                break;
            case 4:
                System.out.println("África do Sul");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
