package state;

public class TarefaEstadoTesting extends TarefaEstado{

    private TarefaEstadoTesting() {};

    private static TarefaEstadoTesting instance = new TarefaEstadoTesting();

    public static TarefaEstadoTesting getInstance() { return instance;}

    public String getEstado() { return "Tarefa sendo testada";}

    public boolean delivered(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        return true;
    }
}