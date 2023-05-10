package state;

public class TarefaEstadoToDo extends TarefaEstado{

    private TarefaEstadoToDo() {};

    private static TarefaEstadoToDo instance = new TarefaEstadoToDo();

    public static TarefaEstadoToDo getInstance() { return instance;}

    public String getEstado() { return "Tarefa a ser feita";}

    public boolean doing(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        return true;
    }

    public boolean done(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        return true;
    }

    public boolean testing(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        return true;
    }

}