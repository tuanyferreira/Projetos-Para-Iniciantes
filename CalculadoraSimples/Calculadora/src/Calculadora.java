import java.util.Scanner;
public class Calculadora {
    /**
     * @param args
     */
    public static void main(String[] args){
       Scanner scanner = new Scanner (System.in);
       
       try{ 
        System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    resultado = num1 / num2;
                }else{
                    System.out.println("ERRO: Divisão por Zero.");
                    return;
                }
                break;
        
        
        
            default:
            System.out.println("Operação invalida.");
                return;
        }
        System.out.println("Resultado:" + resultado);
        
        
    }finally{
        scanner.close();
    }

    }

    @Override
    public String toString() {
        return "Calculadora []";
    }
}
