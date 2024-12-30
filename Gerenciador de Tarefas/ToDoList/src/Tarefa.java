public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    // Getters e Setters

    public int getId(){ return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public boolean isConcluida() { return concluida;}

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + "[" + (concluida ? "Concluída" : "Pendente") + "]";
    }
}



