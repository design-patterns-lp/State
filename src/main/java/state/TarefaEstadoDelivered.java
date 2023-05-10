package state;

public class TarefaEstadoDelivered extends TarefaEstado{

    private TarefaEstadoDelivered() {};

    private static TarefaEstadoDelivered instance = new TarefaEstadoDelivered();

    public static TarefaEstadoDelivered getInstance() { return instance;}

    public String getEstado() { return "Tarefa entregue";}

}