package Set.Convidado;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidados {
  
  private Set<Convidado> lista;

  public ListaConvidados() {
    lista = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    lista.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : lista) {
      if(c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    lista.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return lista.size();
  }

  public void exibirConvidados() {
    System.out.println(lista);
  }

  public static void main(String[] args) {
    ListaConvidados minhaLista = new ListaConvidados();
    minhaLista.adicionarConvidado("Convidado 1", 1234);
    minhaLista.adicionarConvidado("Convidado 2", 1236);
    minhaLista.adicionarConvidado("Convidado 3", 1236);
    minhaLista.adicionarConvidado("Convidado 4", 1237);
    minhaLista.removerConvidadoPorCodigoConvite(1236);
    minhaLista.exibirConvidados();
  }
}
