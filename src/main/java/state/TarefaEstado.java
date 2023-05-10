package state;

public abstract class TarefaEstado {
    public abstract String getEstado();
    public boolean backLog(Tarefa tarefa) { return false;}
    public boolean toDo(Tarefa tarefa) { return false;}
    public boolean doing(Tarefa tarefa) { return false;}
    public boolean done(Tarefa tarefa) { return false;}
    public boolean testing(Tarefa tarefa) { return false;}
    public boolean delivered(Tarefa tarefa) { return false;}
}
