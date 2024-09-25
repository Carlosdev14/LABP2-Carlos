package calculadoraBeta;

public class operacoes {

    private static void verificarDivisor(float n2) {              // função para verificar se o divisor é zero e 'forçar''exceção se for o caso
        if (n2 == 0) {
            throw new ArithmeticException("Operação com divisor zero não é permitida.");
        }
    }

    public static void realizarOperacao(int operacao, float n1, float n2) {
        float resultado;

        try {
            switch (operacao) {
                case 1:
                    resultado = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + resultado);
                    break;

                case 2:
                    resultado = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + resultado);
                    break;

                case 3:
                    resultado = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + resultado);
                    break;

                case 4:
                    verificarDivisor(n2);          // verifica se o divisor é 0;
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                    break;

                case 5:
                    verificarDivisor(n2);          // verifica se o divisor é 0;
                    resultado = n1 % n2;
                    System.out.println("O resto da divisão de " + n1 + " por " + n2 + " é " + resultado);
                    break;

                default:
                    System.out.println("[ERRO]: Operação inválida.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("[ERRO]: " + e.getMessage());
        }
    }
}
