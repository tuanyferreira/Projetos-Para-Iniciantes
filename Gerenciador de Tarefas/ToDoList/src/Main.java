import java.util.Scanner;


public class Main {
    public static void main(String[] args){
       GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
       Scanner scanner = new Scanner (System.in);
       int opcao;
       
       do{
        System.out.println("\n== Gerenciador de Tarefas ==");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Atualizar tarefa");
        System.out.println("4. remover tarefa");
        System.out.println("0. sair");
        System.out.println("\n** Escolha uma opção **");
        opcao = scanner.nextInt();
        scanner.nextLine(); //Limpar buffer

        switch (opcao){
            case 1:
            System.out.println("Título da tarefa: ");
            String titulo = scanner.nextLine();
            System.out.println("Descrição da tarefa: ");
            String descricao = scanner.nextLine();
            gerenciador.adicionarTarefa(titulo, descricao);
            break;

            case 2:
            gerenciador.listarTarefas();
            break;

            case 3:
            System.out.println(" ID da tarefa para atualizar: ");
            int idAtualizar = scanner.nextInt();
            gerenciador.atualizarTarefa(idAtualizar);
            break;

            case 4:
            System.out.println("ID da tarefa para remover: ");
            int idremover = scanner.nextInt();
            gerenciador.removerTarefa(idremover);
            break;

            case 0:
            System.out.println("Saindo...");
            break;

            default:
            System.out.println("Opção inválida!");

        }
       } while (opcao != 0);
        scanner.close();
        
       }
    }



