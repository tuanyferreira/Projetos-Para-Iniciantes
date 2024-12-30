import java.util.ArrayList;

public class GerenciadorDeTarefas {
   private ArrayList<Tarefa> tarefas = new ArrayList<>();
   private int proximoId = 1;
   
   public void adicionarTarefa(String titulo, String descricao){
    Tarefa novaTarefa = new Tarefa(proximoId, titulo, descricao);
    tarefas.add(novaTarefa);
    proximoId++;
    System.out.println("Tarefa Adicionada!");
   }

   public void listarTarefas(){
    if (tarefas.isEmpty()) {
        System.out.println("Nenhuma Tarefa encontrada.");
    } else{
        for (Tarefa tarefa : tarefas){
            System.out.println(tarefas);
        }
    }
}
   

   @Override
public String toString() {
    return "GerenciadorDeTarefas [tarefas=" + tarefas + ", proximoId=" + proximoId + "]";
}

public void atualizarTarefa(int id){
    for(Tarefa tarefa : tarefas){
        if(tarefa.getId() == id){
            tarefa.setConcluida(!tarefa.isConcluida());
            System.out.println("Status de tarefa atualizado!");
            return;
        }
    }
    System.out.println("Tarefa não encontrada.");
   }
   public void removerTarefa( int id){
    tarefas.removeIf(tarefa -> tarefa.getId() == id);
    System.out.println("Tarefa removida!");
   }
   
}
