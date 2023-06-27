package Estoque.Entity;

public class Item {
    
    private int id;
    private String nome;
    private int qtde;
    public float valor;

    //Construtor Padrão
    public Item(int id, String nome, int qtde, float valor) {
        this.id = id;
        this.nome = nome;
        this.qtde = qtde;        
        this.valor = valor;        
    }

    //Métodos Getter para ler os dados que são privados.
    public int getId (){
        return id;
    }
    public String getNome(){
        return nome;
    }
    
    public void setId(){
        this.id = this.id++;
    }

    public void setQtde (int qtde){
        this.qtde = this.qtde + qtde;
    }

    //Retirar Itens do Estoque (Vendas)
    public void removerQtde (int qtde){
        if (qtde <= this.qtde){
            this.qtde = this.qtde - qtde;
        } else{
            System.out.println("No estoque existe(m) apenas " + this.qtde + " unidade(s) do item e foram retiradas.\n");
            this.qtde = 0;
        }
    }

    //Método para calcular valor total dos itens
    public float valorTotal (){
        return qtde * valor;
    }

    //Formatar Impressão do Item na classe Estoque.java
    @Override
    public String toString() {
        return String.format(
            "======================================\nCodigo: %d\nItem: %s\nQuantidade: %d\nValor Unitário: %.2f\nValor Total: %.2f\n======================================", id, nome, qtde, valor, valorTotal());
    }
}
