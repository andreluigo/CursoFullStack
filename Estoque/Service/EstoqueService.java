package Estoque.Service;

import java.util.ArrayList;
import java.util.List;


import Estoque.Entity.Item;

public class EstoqueService {
    
    //Instanciação de listas
    private List<Item> estoque = new ArrayList<>(); //private pq só vai ser acessível por esta classe..

    public void mostarEstoque(){
        System.out.println("RELACAO DE ITENS NO ESTOQUE");
        System.out.println("===================================");
        for (Item item : estoque) {
            System.out.println(item);
        }
        System.out.println("===================================\n");
    }

    //Método para Inserir Itens ao estoque
    public void inserirItem(int id, String nome, float valor){
        if (idOuNomeExiste(id, nome)){
            System.out.printf("Codigo %d ou Item %s já cadastrados!\n\n", id, nome);
        } else{
            Item item = new Item(id, nome, valor);
            estoque.add(item);
        }     
              
        
        /*System.out.println("=========================================================");
        System.out.println("Digite o nome do Item a ser cadastrado:");
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite a quantidade de Itens a serem cadastrados:");
        Scanner nome = new Scanner(System.in);*/
    }

    private boolean idOuNomeExiste (int id, String nome){
        for (Item item : estoque) {
            if (id == item.getId() || item.getNome().equals(nome)){
                return true;
            }            
        }
        return false;
    }

    
    
}
 