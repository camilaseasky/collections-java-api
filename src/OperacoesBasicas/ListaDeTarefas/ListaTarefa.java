package OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
   private List<Tarefa> lista;

  public ListaTarefa() {
    this.lista = new ArrayList<>();
  }
  
  public void adicionarTarefa(String descricao) {
    this.lista.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasRemover = new ArrayList<>();
    for (Tarefa t: lista) {
      if(t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasRemover.add(t);
      }
    }
    lista.removeAll(tarefasRemover);
  }

  public int obterTotalTarefas() {
    return lista.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(lista);
  }
  

  public static void main(String[] args) {
    ListaTarefa lista = new ListaTarefa();
    lista.adicionarTarefa("Fazer compras");
    lista.adicionarTarefa("Visitar avó");
    lista.adicionarTarefa("Ir à academia");
    lista.adicionarTarefa("Passar na costureira");
    lista.adicionarTarefa("Entregar encomendas");
    lista.adicionarTarefa("Ir à academia");
    System.out.println(lista.obterTotalTarefas());
    lista.removerTarefa("Ir à academia");
    lista.obterDescricoesTarefas();
  }

}
