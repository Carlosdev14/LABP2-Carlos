package calculadora;

public class principal {
    public static void main(String[] args) {
        System.out.println("\n\nCalculadora\n------------------------------");

        do {
            System.out.println("\nDigite qual operação deseja realizar:\n");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto");
            System.out.println("6 - Sair\n");

            int escolhaOperacao = entrada.entradaOperacao();                         // usa a classe entrada para receber a operação

            if (escolhaOperacao == 6) {
                operacoes.realizarOperacao(6, 0, 0);                     // chama a funçao de operacoes para finalizar
                break;                                                                                            //  sai do loop e fecha o programa
            }

            System.out.println("");            //pula linha
            float n1 = entrada.entradaNumero("Digite o primeiro número: ");
            float n2 = entrada.entradaNumero("Digite o segundo número: ");
            System.out.println("");            //pula linha

            operacoes.realizarOperacao(escolhaOperacao, n1, n2);

        } 
        
        while (entrada.continuarOperacao());     // pergunta se o usuário deseja continuar

        entrada.fecharScanner();                       // fecha o Scanner
        System.out.println("\nPrograma encerrado.");
    }
}
