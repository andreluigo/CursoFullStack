package Estoque.Service;

//import Estoque.Entity.Item;

public class Estoque {
    
    public static void main(String[] args) {
        //Item item = new Item(15, "Item de Teste", 8.45f);

        EstoqueService estoqueService = new EstoqueService();
        estoqueService.inserirItem(1, "Caderno", 12.99f);
        estoqueService.inserirItem(2, "Mochilha", 154.99f);
        estoqueService.inserirItem(1, "Caneta", 8.99f);
        estoqueService.mostarEstoque();
    }


}
