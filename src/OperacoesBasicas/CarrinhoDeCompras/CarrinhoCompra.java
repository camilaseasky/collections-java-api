package OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
  
  private List<Item> items;

  public CarrinhoCompra() {
    this.items = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    var item = new Item(nome, preco, quantidade);
    this.items.add(item);
  }

  public void removerItem(String nome) {
    List<Item> itemsRemover = new ArrayList<>();
    for (Item i : items) {
      if(i.getNome().equals(nome)) {
        itemsRemover.add(i);
      }
    }
    items.removeAll(itemsRemover);
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (Item i : items) {
      valorTotal += i.getPreco();
    }
    return valorTotal;
  }

  public void exibirItems() {
    System.out.println(this.items);
  }

  public static void main(String[] args) {
    CarrinhoCompra meuCarrinho = new CarrinhoCompra();
    meuCarrinho.adicionarItem("Sapato", 250.50, 20);
    meuCarrinho.adicionarItem("Blusa", 349.99, 10);
    System.out.println(meuCarrinho.calcularValorTotal());
    meuCarrinho.removerItem("Sapato");
    meuCarrinho.exibirItems();
  }
}
