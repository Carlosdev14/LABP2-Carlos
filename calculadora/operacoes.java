package calculadora;

public class operacoes {

    
    public static void realizarOperacao(int operacao, float n1, float n2) {     // função para realizar as operações
        float resultado;

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
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                } 
                
                else {
                    System.out.println("[ERRO]: Não existe divisão por zero.");
                }
                break;

            case 5:
                if (n2 != 0) {
                    resultado = n1 % n2;
                    System.out.println("O resto da divisão de " + n1 + " por " + n2 + " é " + resultado);
                } 
                
                else {
                    System.out.println("[ERRO]: Divisão por zero não é permitida.");
                }
                break;
        }
    }
}
