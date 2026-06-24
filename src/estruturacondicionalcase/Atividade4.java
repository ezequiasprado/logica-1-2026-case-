package estruturacondicionalcase;

import java.util.Scanner;

public class Atividade4 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma categoria:");
        System.out.println("• 1: Ficção");
        System.out.println("• 2: Não Ficção");
        System.out.println("• 3: Romance");
        System.out.println("• 4: Terror");
        System.out.println("• 5: Mistério");
        int categoria = scanner.nextInt();

        switch (categoria) {
            case 1 :
                System.out.println("O livro pertence à categoria" +
                        " de Ficção");
                break;
            case 2 :
                System.out.println("O livro pertence à categoria" +
                        " de Não Ficção");
                break;
            case 3 :
                System.out.println("O livro pertence à categoria" +
                        " de Romance");
                break;
            case 4 :
                System.out.println("O livro pertence à categoria" +
                        " de Terror");
                break;
            case 5 :
                System.out.println("O livro pertence à categoria" +
                        " de Mistério");
                break;
            default:
                System.out.println("Categoria inválida");
        }
    }
}
