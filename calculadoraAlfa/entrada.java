package calculadoraAlfa;

import java.util.Scanner;

public class entrada {
    private static final Scanner scanner = new Scanner(System.in); // Scanner compartilhado

   
    public static int entradaOperacao() {           //  função para verificar se a entrada é um número entre 1 e 6
        int operacao;

        while (true) {
            System.out.print("Digite um número (1 a 6): ");
            if (scanner.hasNextInt()) {
                operacao = scanner.nextInt();

                if (operacao >= 1 && operacao <= 6) {
                    return operacao;
                } 
                
                else {
                    System.out.println("[ERRO]: O número deve estar entre 1 e 6.");
                }
            } 
            
            else {
                System.out.println("[ERRO]: Digite um número inteiro válido.");
                scanner.next();                                              // descartar entrada inválida
            }
        }
    }

   
    public static float entradaNumero(String mensagem) {      // função para obter um número float do usuário
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            } 
            
            else {
                System.out.println("[ERRO]: Digite um número válido.");
                scanner.next();                                                          // descartar entrada inválida
            }
        }
    }

   
    public static boolean continuarOperacao() {                        //  função para perguntar se o usuário deseja realizar outra operação
        while (true) {

            System.out.println("");            //pula linha
            System.out.print("Deseja realizar outra operação? (S/N): ");
            System.out.println("");  
            
            String resposta = scanner.next().trim().toUpperCase();

            if (resposta.equals("S")) {
                return true;             // continua o loop
            } 
            
            else if (resposta.equals("N")) {
                return false;            // sai do loop
            } 
            
            else {
                System.out.println("[ERRO]: Digite 'S' para sim ou 'N' para não.");
            }
        }
    }

   
    public static void fecharScanner() {            // função para fechar o Scanner
        scanner.close();
    }
}
