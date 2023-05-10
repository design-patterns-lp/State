package state;

public class TarefaEstadoDone extends TarefaEstado{

    private TarefaEstadoDone() {};

    private static TarefaEstadoDone instance = new TarefaEstadoDone();

    public static TarefaEstadoDone getInstance() { return instance;}

    public String getEstado() { return "Tarefa feita";}

    public boolean testing(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        return true;
    }
    public boolean delivered(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        return true;
    }

}
