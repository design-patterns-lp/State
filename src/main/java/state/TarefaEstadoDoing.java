package state;

public class TarefaEstadoDoing extends TarefaEstado{

    private TarefaEstadoDoing() {};

    private static TarefaEstadoDoing instance = new TarefaEstadoDoing();

    public static TarefaEstadoDoing getInstance() { return instance;}

    public String getEstado() { return "Tarefa sendo feita";}

    public boolean done(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        return true;
    }

    public boolean testing(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        return true;
    }
    public boolean delivered(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        return true;
    }

}