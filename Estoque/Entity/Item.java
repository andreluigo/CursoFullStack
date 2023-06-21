package Estoque.Entity;

public class Item {
    
    private int id;
    private String nome;
    public int qtde;
    public float valor;

    //Construtor Padrão
    public Item(int id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        qtde = 0;        
    }

    //Métodos Getter para ler os dados que são privados.
    //Neste caso não é necessário criar os métodos setters pq assumimos que os valores não podem ser alterados.
    public int getId (){
        return id;
    }
    public String getNome(){
        return nome;
    }
    
    public void setId(){
        this.id = this.id++;
    }

    //Método para calcular valor total dos itens
    public float valorTotal (){
        return qtde * valor;
    }

    //Formatar Impressão do Item na classe Estoque.java
    @Override
    public String toString() {
        return String.format(
            "===================================\nCodigo: %d\nItem: %s\nQuantidade: %d\nValor Unitário: %.2f\nValor Total: %.2f\n===================================", id, nome, qtde, valor, valorTotal());
    }



}
