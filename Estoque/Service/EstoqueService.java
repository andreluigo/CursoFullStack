package Estoque.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Estoque.Entity.Item;

public class EstoqueService {
    
    Scanner sc = new Scanner(System.in);

    //Instanciação de listas
    private List<Item> estoque = new ArrayList<>(); //private pq só vai ser acessível por esta classe..

    //Exibir os Itens Cadastrados no Estoque
    public void mostarEstoque(){
        System.out.println("\nRELACAO DE ITENS NO ESTOQUE");
        System.out.println("======================================");
        for (Item item : estoque) {
            System.out.println(item);
        }
        System.out.println("======================================\n");
    }

    //Método para Inserir Itens ao Estoque
    public void addItem(int id, String nome, int qtde, float valor){
        if (idOuNomeExiste(id, nome)){
            System.out.printf("\nCodigo %d ou Item %s já cadastrados!\n\n", id, nome);
        } else{
            Item item = new Item(id, nome, qtde, valor);
            estoque.add(item);
            System.out.println("\nItem cadastrado com sucesso!\n");
        }        
    }

    //Atualiza Quantidade de um Determinado Item no Estoque
    public boolean atualizarEstoque (int id, int qtde){        
        Item item = getById(id);
        if (item != null){
            item.setQtde(qtde);
            return true;
        } else{
            System.out.println("\nItem não existe no estoque!\nTente novamente inserindo um código válido!");
            return false;
        }
    }

    //Retirar Itens do Estoque (vendas)
    public boolean retiradaEstoque(int id, int qtde){
        Item item = getById(id);
        if (item != null){
            item.removerQtde(qtde);
            return true;
        } else{
            System.out.println("\nItem não existe no estoque!\nTente novamente inserindo um código válido!");
            return false;
        }        
    }

    //Excluir Item do Estoque
    public void removerItem(int id){
        Item item = getById(id);
        if (item == null){
            System.out.println("Item não está cadastrado no estoque!\n");
        } else{
            System.out.println("O item abaixo foi excluído: \n\n" + item + "\n\n");
            estoque.remove(item);            
        }
    }

    //Buscar Item no Estoque
    public void buscarItem(int id){
        Item item = getById(id);
        if (item == null){
            System.out.println("\nItem não está cadastrado no estoque!");
        } else{
            System.out.println("\nO item pesquisado é:\n");
            System.out.println("======================================");
            System.out.println(item);
            System.out.println("======================================");
        }
    }

    //Buscar e Retornar Item do Estoque
    public Item getById(int id){
        for (Item item : estoque) {
            if (id == item.getId()){
                return item;
            } 
        }
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
 