package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TarefaTest {
    Tarefa tarefa;

    @BeforeEach
    public void setUp() { tarefa = new Tarefa();}

    @Test
    public void naoDevecolocarTarefaBackLogEmBackLog(){
        tarefa.setEstado(TarefaEstadoBackLog.getInstance());
        assertFalse(tarefa.backlog());
    }

    @Test
    public void deveFazerTarefaBackLog(){
        tarefa.setEstado(TarefaEstadoBackLog.getInstance());
        assertTrue(tarefa.toDo());
        assertEquals(TarefaEstadoToDo.getInstance(), tarefa.getEstado());
    }

    @Test
    public void naoDevecolocarTarefaBackLogEmDoing(){
        tarefa.setEstado(TarefaEstadoBackLog.getInstance());
        assertFalse(tarefa.doing());
    }

    @Test
    public void naoDevecolocarTarefaBackLogEmDone(){
        tarefa.setEstado(TarefaEstadoBackLog.getInstance());
        assertFalse(tarefa.done());
    }

    @Test
    public void naoDevecolocarTarefaBackLogEmTesting(){
        tarefa.setEstado(TarefaEstadoBackLog.getInstance());
        assertFalse(tarefa.testing());
    }

    @Test
    public void naoDevecolocarTarefaBackLogEmDelivered(){
        tarefa.setEstado(TarefaEstadoBackLog.getInstance());
        assertFalse(tarefa.delivered());
    }

    ///////////////////

    @Test
    public void naoDevecolocarTarefaToDoEmBackLog(){
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        assertFalse(tarefa.backlog());
    }

    @Test
    public void naoDevecolocarTarefaToDoEmToDo(){
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        assertFalse(tarefa.toDo());
    }

    @Test
    public void deveFazerTarefaToDo(){
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        assertTrue(tarefa.doing());
        assertEquals(TarefaEstadoDoing.getInstance(), tarefa.getEstado());
    }
    @Test
    public void deveTerminarTarefaToDo(){
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        assertTrue(tarefa.done());
        assertEquals(TarefaEstadoDone.getInstance(), tarefa.getEstado());
    }

    @Test
    public void deveTestarTarefaToDo(){
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        assertTrue(tarefa.testing());
        assertEquals(TarefaEstadoTesting.getInstance(), tarefa.getEstado());
    }

    @Test
    public void naoDevecolocarTarefaToDoEmDelivered(){
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        assertFalse(tarefa.delivered());
    }

    /////////////////////

    @Test
    public void naoDeveColocarTarefaDoingEmBackLog(){
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        assertFalse(tarefa.backlog());
    }

    @Test
    public void naoDeveColocarTarefaDoingEmToDo(){
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        assertFalse(tarefa.toDo());
    }

    @Test
    public void naoDeveColocarTarefaDoingEmDoing(){
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        assertFalse(tarefa.doing());
    }

    @Test
    public void deveTerminarTarefaDoing(){
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        assertTrue(tarefa.done());
        assertEquals(TarefaEstadoDone.getInstance(), tarefa.getEstado());
    }

    @Test
    public void deveTestarTarefaDoing(){
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        assertTrue(tarefa.testing());
        assertEquals(TarefaEstadoTesting.getInstance(), tarefa.getEstado());
    }

    @Test
    public void deveEntregarTarefaDoing(){
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        assertTrue(tarefa.delivered());
        assertEquals(TarefaEstadoDelivered.getInstance(), tarefa.getEstado());
    }

    /////////////////////

    @Test
    public void naoDeveColocarTarefaDoneEmBackLog(){
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        assertFalse(tarefa.backlog());
    }

    @Test
    public void naoDeveColocarTarefaDoneEmToDo(){
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        assertFalse(tarefa.toDo());
    }

    @Test
    public void naoDeveColocarTarefaDoneEmDoing(){
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        assertFalse(tarefa.doing());
    }

    @Test
    public void naoDeveColocarTarefaDoneEmDone(){
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        assertFalse(tarefa.done());
    }

    @Test
    public void deveTestarTarefaDone(){
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        assertTrue(tarefa.testing());
        assertEquals(TarefaEstadoTesting.getInstance(), tarefa.getEstado());
    }

    @Test
    public void deveEntregarTarefaDone(){
        tarefa.setEstado(TarefaEstadoDone.getInstance());
        assertTrue(tarefa.delivered());
        assertEquals(TarefaEstadoDelivered.getInstance(), tarefa.getEstado());
    }

    ////////////////////

    @Test
    public void naoDeveColocarTarefaTestingEmBackLog(){
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        assertFalse(tarefa.backlog());
    }

    @Test
    public void naoDeveColocarTarefaTestingEmToDo(){
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        assertFalse(tarefa.toDo());
    }

    @Test
    public void naoDeveColocarTarefaTestingEmDoing(){
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        assertFalse(tarefa.doing());
    }

    @Test
    public void naoDeveColocarTarefaTestingEmDone(){
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        assertFalse(tarefa.done());
    }

    @Test
    public void naoDeveColocarTarefaTestingEmTesting(){
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        assertFalse(tarefa.testing());
    }

    @Test
    public void deveEntregarTarefaTesting(){
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        assertTrue(tarefa.delivered());
        assertEquals(TarefaEstadoDelivered.getInstance(), tarefa.getEstado());
    }

    //////////////////////////

    @Test
    public void naoDeveColocarTarefaDeliveredEmBackLog(){
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertFalse(tarefa.backlog());
    }

    @Test
    public void naoDeveColocarTarefaDeliveredEmToDo(){
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertFalse(tarefa.toDo());
    }

    @Test
    public void naoDeveColocarTarefaDeliveredEmDoing(){
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertFalse(tarefa.doing());
    }

    @Test
    public void naoDeveColocarTarefaDeliveredEmDone(){
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertFalse(tarefa.done());
    }

    @Test
    public void naoDeveColocarTarefaDeliveredEmTesting(){
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertFalse(tarefa.testing());
    }

    @Test
    public void naoDeveColocarTarefaDeliveredEmDelivered(){
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertFalse(tarefa.delivered());
    }




}
