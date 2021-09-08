import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculos Físicos\n========");

        try {
            System.out.println(
                    "Escolha a operação: \n[1] - Força Peso\n[2] - Força Centripeta\n[3] - Impulso\n[4] - Força Elástica\n[5] - Velocidade Média\n[6] - Movimento Retilíneo Uniforme(MRU)\n[7] - Movimento Retilíneo Uniformemte Variado(MRUV) ");
            Scanner teclado = new Scanner(System.in);
            int op = teclado.nextInt();

            if (op == 1) {

                System.out.println("Digite o valor da massa: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite o valor da aceleração: ");
                Float num2 = teclado.nextFloat();

                Formulas.forcaPeso(num1, num2);

                teclado.close();

            } else if (op == 2) {

                System.out.println("Digite o valor da massa: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite o valor da velocidade: ");
                Float num2 = teclado.nextFloat();
                System.out.println("Digite o valor do raio: ");
                Float num3 = teclado.nextFloat();

                Formulas.forcaCentripeta(num1, num2, num3);

                teclado.close();
            } else if (op == 3) {

                System.out.println("Digite o valor da força aplicada: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite o tempo: ");
                Float num2 = teclado.nextFloat();

                Formulas.impulso(num1, num2);

                teclado.close();
            } else if (op == 4) {

                System.out.println("Digite a constante elástica: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite a variação elástica: ");
                Float num2 = teclado.nextFloat();

                Formulas.forcaElastica(num1, num2);

                teclado.close();
            } else if (op == 5) {

                System.out.println("Digite a distancia percorrida: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite o tempo decorrido: ");
                Float num2 = teclado.nextFloat();

                Formulas.velocidadeMedia(num1, num2);

                teclado.close();
            } else if (op == 6) {

                System.out.println("Digite a posição inicial: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite a velocidade: ");
                Float num2 = teclado.nextFloat();
                System.out.println("Digite o tempo: ");
                Float num3 = teclado.nextFloat();

                Formulas.funcaoMRU(num1, num2, num3);

                teclado.close();
            } else if (op == 7) {

                System.out.println("Digite a velocidade inicial: ");
                Float num1 = teclado.nextFloat();
                System.out.println("Digite a aceleração: ");
                Float num2 = teclado.nextFloat();
                System.out.println("Digite o tempo decorrido: ");
                Float num3 = teclado.nextFloat();

                Formulas.funcaoMRUV(num1, num2, num3);

                teclado.close();
            } else
                System.out.println("Digito incorreto. Programa encerrado");

        } catch (Exception ex) {
            System.out.println("Digito incorreto. Programa encerrado");

        }

    }

}
