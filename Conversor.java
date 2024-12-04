import java.util.Locale;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcao;

        do{
            System.out.println("\n=== Conversor ===");
            System.out.println("1. Converter Temperatura (Celsius ↔ Fahrenheit)");
            System.out.println("2. Converter Moeda (Reais ↔ Dólares)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido!");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    converterTemperatura(scanner);
                    break;
                case 2: 
                    converterMoeda(scanner);    
                    break;    
                case 3:
                System.out.println("Encerrando o programa...");
                    break;
                default:
                System.out.println("Opção inválida. Tente novamente.");        
            }
        }while (opcao != 3);
       
        scanner.close();
           
        }
        private static void converterTemperatura(Scanner scanner){
            System.out.println("\n=== Conversor de Temperatura ===");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.print("Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido!");
                scanner.next();
            }
            int opcao = scanner.nextInt();
            
            System.out.println("Digite a temperatura: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido!");
                scanner.next();
            }
            double temperatura = scanner.nextDouble();

            if (opcao == 1) {
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
            }else if (opcao == 2){
                double celsius = (temperatura - 32) * 5 / 9;
                System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);  
            }else {
                System.out.println("Opção inválida.");
            }
        }

        private static void converterMoeda(Scanner scanner){
            System.out.println("\n=== Conversor de Moeda ===");
            System.out.println("1. Reais para Dólares");
            System.out.println("2. Dólares para Reais");
            System.out.print("Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido!");
                scanner.next();
            }
            int opcao = scanner.nextInt();

            System.out.println("Digite um valor: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido!");
                scanner.next();
            }
            double valor = scanner.nextDouble();

            System.out.println("Digite a taxa de câmbio atual (ex.: 5.20): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido!");
                scanner.next();
            }
            double taxaCambio = scanner.nextDouble();
            if (opcao == 1) {
                double dolares = valor / taxaCambio;
                System.out.printf("Valor em Dólares: $%.2f\n", dolares);
            }else if (opcao == 2) {
                double reais = valor * taxaCambio;
                System.out.printf("Valor em Reais: R$%.2f\n", reais);
            }else{
                System.out.println("Opção Inválida.");
            }

        }
    }

