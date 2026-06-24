package estruturacondicionalcase;

import java.util.Scanner;

public class Atividade3 {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        int x = scanner.nextInt();
        System.out.println("Digite o valor de A");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B");
        double b = scanner.nextDouble();

        if (x < 0) {
            System.out.println("O valor de X deve ser postivo.");
        } else if (a == b) {
            System.out.println("O valor de A deve ser diferente de B");
        } else {
            switch (x){
                case 1 :
                    System.out.println("A soma é: " + (a + b));
                    break;
                case 2:
                    if (b == 0){
                        System.out.println("Não possivel realizar " +
                                "divisão por zero");
                    } else {
                        System.out.println("A divisão é: " + (a / b));
                    }
                    break;
                case 3:
                    if (a > b) {
                        System.out.println(b + "," + a);
                    } else {
                        System.out.println(a + "," + b);
                    }
                    break;
                case 4:
                    if (a > b){
                        System.out.println(a - b);
                    } else {
                        System.out.println(b - a);
                    }
                    break;
                case 5:
                    System.out.println((a + b) /2);
                break;
                default:
                    System.out.println("O valor de x deve ser 1,2,3,4 ou 5.");
            }
        }


    }
}
