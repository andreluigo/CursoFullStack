package Estoque.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Estoque.Entity.Item;

public class EstoqueService {
    
    Scanner sc = new Scanner(System.in);

    //Instanciação de listas
    private List<Item> estoque = new ArrayList<>(); //private pq só vai ser acessível por esta classe..

    public void mostarEstoque(){
        System.out.println("\nRELACAO DE ITENS NO ESTOQUE");
        System.out.println("===================================");
        for (Item item : estoque) {
            System.out.println(item);
        }
        System.out.println("===================================\n");
    }

    //Método para Inserir Itens ao estoque
    public void addItem(int id, String nome, int qtde, float valor){
        if (idOuNomeExiste(id, nome)){
            System.out.printf("\nCodigo %d ou Item %s já cadastrados!\n\n", id, nome);
        } else{
            Item item = new Item(id, nome, qtde, valor);
            estoque.add(item);
            System.out.println("\nItem cadastrado com sucesso!\n");
        }     
              
        
        /*System.out.println("=========================================================");
        System.out.println("Digite o nome do Item a ser cadastrado:");
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite a quantidade de Itens a serem cadastrados:");
        Scanner nome = new Scanner(System.in);*/
    }

    public void atualizarEstoque (int id, int qtde){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("\nDigite a quantidade a ser adicionada no estoque: ");
        //int id = sc.nextInt();
        Item item = getById(id);
        item.setQtde(qtde);

        //sc.close();
    }

    public void retiradaEstoque(int id, int qtde){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Qual o código do item você gostaria de atualizar?");
        //int id = sc.nextInt();
        Item item = getById(id);
        item.removerQtde(qtde);

        //sc.close();
    }

    //Remover Item do Estoque
    public void removerItem(int id){
        Item item = getById(id);
        if (item == null){
            System.out.println("Item não está cadastrado no estoque!\n");
        } else{
            System.out.println("O item abaixo foi excluído: \n\n" + item + "\n\n");
            estoque.remove(item);            
        }
    }

    public void buscarItem(int id){
        Item item = getById(id);
        if (item == null){
            System.out.println("Item não está cadastrado no estoque!\n");
        } else{
            System.out.println("O item pesquisado é:\n\n" + item + "\n\n");
        }
    }




    //Buscar e Remover Item do Estoque
    public Item getById(int id){
        for (Item item : estoque) {
            if (id == item.getId()){
                return item;
            } 
        }
        //System.out.println("Item não existe no estoque!");
        return null;
    }

    //Verifica se um ID ou Item já estão cadastrados
    private boolean idOuNomeExiste (int id, String nome){
        for (Item item : estoque) {
            if (id == item.getId() || item.getNome().equals(nome)){
                return true;
            }            
        }
        return false;
    }


    
}
 