package OperacoesBasicas.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  
  private List<Pessoa> lista;

  public OrdenacaoPessoa() {
    this.lista = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    lista.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(lista);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(lista);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
    pessoas.adicionarPessoa("Pessoa 1", 25, 1.65);
    pessoas.adicionarPessoa("Pessoa 2", 17, 1.55);
    pessoas.adicionarPessoa("Pessoa 3", 23, 1.75);
    System.out.println(pessoas.ordenarPorAltura());
    System.out.println(pessoas.ordenarPorIdade());
  }

}
