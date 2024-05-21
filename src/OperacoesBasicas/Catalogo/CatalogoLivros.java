package OperacoesBasicas.Catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  
  private List<Livro> catalogo;

  public CatalogoLivros() {
    this.catalogo = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    this.catalogo.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livros = new ArrayList<>();
    if(!this.catalogo.isEmpty()) {
      for(Livro l : catalogo) {
        if(l.getAutor().equalsIgnoreCase(autor)) {
          livros.add(l);
        }
      }
    }
    return livros;
  }

  public List<Livro> livrosPorIntervaloAno(int anoInicial, int anoFinal) {
    List<Livro> livros = new ArrayList<>();
    if(!this.catalogo.isEmpty()) {
      for(Livro l : catalogo) {
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livros.add(l);
        }
      }
    }
    return livros;
  }

  public Livro pesquisaPorTitulo(String titulo) {
    Livro livro = null;
    if (!this.catalogo.isEmpty()) {
      for(Livro l : catalogo) {
        if(l.getTitulo().equalsIgnoreCase(titulo)) {
          livro = l;
          break;
        }
      }
    }
    return livro;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();
    catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
    catalogo.adicionarLivro("Livro 2", "Autor 2", 2021);
    catalogo.adicionarLivro("Livro 2", "Autor 3", 2022);
    catalogo.adicionarLivro("Livro 3", "Autor 2", 2023);
    catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);
    System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
    System.out.println(catalogo.pesquisaPorTitulo("Livro 2"));
    System.out.println(catalogo.livrosPorIntervaloAno(2021, 2023));
  }


}
