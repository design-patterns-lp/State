package state;

public class Tarefa {
    private String nome;
    private TarefaEstado estado;

    public Tarefa() { this.estado = TarefaEstadoBackLog.getInstance();}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(TarefaEstado estado) {
        this.estado = estado;
    }

    public TarefaEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean backlog() {return estado.backLog(this);}
    public boolean toDo() {return estado.toDo(this);}
    public boolean doing() {return estado.doing(this);}
    public boolean done() {return estado.done(this);}
    public boolean testing() {return estado.testing(this);}
    public boolean delivered() {return estado.delivered(this);}
}
