package state;

public class TarefaEstadoBackLog extends TarefaEstado{

    private TarefaEstadoBackLog() {};

    private static TarefaEstadoBackLog instance = new TarefaEstadoBackLog();

    public static TarefaEstadoBackLog getInstance() { return instance;}

    public String getEstado() { return "Tarefa em BackLog";}

    public boolean toDo(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        return true;
    }


}
