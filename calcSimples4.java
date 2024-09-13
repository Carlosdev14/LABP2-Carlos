import java.util.Scanner;

public class calcSimples4 {

    public static int entrada() { // função para verificar se o número está entre 1 e 6
        Scanner scanner = new Scanner(System.in);
        int operacao;

        while (true) {
            System.out.print("Digite um número (1 a 6): ");
            if (scanner.hasNextInt()) {
                operacao = scanner.nextInt();
                
                if (operacao >= 1 && operacao <= 6) {  // verifica se o número está entre 1 e 6
                    return operacao; // manda a operaçao para a main
                } 
                
                else {
                    System.out.println("[ERRO]: O número deve estar entre 1 e 6.");
                }
            } 
            
            else {
                System.out.println("[ERRO]: Digite um número inteiro válido.");
                scanner.next(); //  recebe a operaçao denovo
            }
        }
    }

    public static void calculadora(int escolhaOperacao){

        Scanner scanner = new Scanner(System.in);
        float n1 = 0, n2 = 0, resultado;

        if (escolhaOperacao != 6) {  // verifica se será realizada uma operaçao de fato

            while (true) {   // verifica se as entradas sao inteiras

                System.out.print("Digite o primeiro número: ");

                if (scanner.hasNextFloat()) {
                    n1 = scanner.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    if (scanner.hasNextFloat()) {
                        n2 = scanner.nextFloat();
                        break;
                    } else {
                        System.out.println("\n[ERRO]: Digite um número válido.");
                        scanner.next(); // descarta e pede outra
                    }
                } 
                
                else {
                    System.out.println("\n[ERRO]: Digite um número válido.");
                    scanner.next(); // descarta e pede outra
                }
            }
        }

        if (escolhaOperacao == 1) {
            resultado = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + resultado);
        } 
        
        else if (escolhaOperacao == 2) {
            resultado = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + resultado);
        } 
        
        else if (escolhaOperacao == 3) {
            resultado = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = " + resultado);
        } 
        
        else if (escolhaOperacao == 4) {
            if (n2 != 0) {
                resultado = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + resultado);
            } 
            else {
                System.out.println("\n[ERRO]: Não existe divisão por zero.");
            }
        } 
        
        else if (escolhaOperacao == 5) {
            if (n2 != 0) {
                resultado = n1 % n2;
                System.out.println("O resto da divisão de " + n1 + " por " + n2 + " é " + resultado);
            } 
            else {
                System.out.println("\n[ERRO]: Divisão por zero não é permitida.");
            }
        } 
        
        else if (escolhaOperacao == 6) {
            System.out.println("\n\nFechando o programa");
            return; // Sai do programa
        }
        

        System.out.println("Deseja fazer outra operação?\n");
        
    }

    public static void imprimir(){
        Scanner scanner = new Scanner(System.in);

        int escolhaOperacao;
        
        while(true){
            System.out.println("\nDigite qual operação deseja realizar:\n");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto");
            System.out.println("6 - Sair\n");

            escolhaOperacao = entrada();  // recebe a operação 
        }
    }
    public static void main(String[] args) {

        System.out.println("\nCalculadora\n------------------------------");
        imprimir();


    }
}