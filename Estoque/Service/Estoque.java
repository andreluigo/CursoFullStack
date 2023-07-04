package Estoque.Service;

import java.util.Scanner;

public class Estoque {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        EstoqueService estoqueService = new EstoqueService();

        int opt;

        do{
            System.out.println("\n======================================");
            System.out.println("MENU - QUAL OPERAÇÃO DESEJA REALIZAR?");
            System.out.println("======================================");
            System.out.println("1 - Exibir Estoque");
            System.out.println("2 - Buscar Item");
            System.out.println("3 - Cadastrar Item");
            System.out.println("4 - Excluir Item");
            System.out.println("5 - Alterar Quantidade");
            System.out.println("6 - Saída de Estoque");
            System.out.println("7 - Sair");
            System.out.println("======================================");
            System.out.println("======================================\n");
            opt = sc.nextInt();
            if (opt == 1){
                estoqueService.mostarEstoque();
            }else if (opt == 2){
                System.out.println("\nDigite o código do item a pesquisar: ");
                int id = sc.nextInt();
                estoqueService.buscarItem(id);
            }else if (opt == 3){
                System.out.println("\nDigite o código do item a ser cadastrado: ");
                int id = sc. nextInt();
                System.out.println("Digite o nome do item a ser cadastrado:");
                String nome = name.nextLine();                
                System.out.println("Digite a quantidade a ser cadastrada:");
                int qtde = sc.nextInt();
                System.out.println("Digite o valor item a ser cadastrado:");
                float valor = sc.nextFloat();
                estoqueService.addItem(id, nome, qtde, valor);
                estoqueService.mostarEstoque();
            }else if (opt == 4){
                System.out.println("\nDigite o código do item a ser excluído:");
                int id = sc.nextInt();
                estoqueService.removerItem(id);
                System.out.println("\nItem excluído com sucesso!\n");
                estoqueService.mostarEstoque();
            }else if (opt == 5){
                System.out.println("\nDigite o código do item a ser alterado a quantidade:");
                int id = sc.nextInt();
                System.out.println("Digite a quantidade a ser adicionada ao estoque:");
                int qtde = sc.nextInt();                
                if (estoqueService.atualizarEstoque(id, qtde) == true){
                    estoqueService.atualizarEstoque(id, qtde);
                    System.out.println("\nEstoque atualizado!\n");
                    estoqueService.mostarEstoque();
                }
            }else if (opt == 6){
                System.out.println("\nDigite o código do item que sairá do estoque:");
                int id = sc.nextInt();
                System.out.println("\nDigite a quantidade a ser retirada do estoque:");
                int qtde = sc.nextInt();
                if (estoqueService.retiradaEstoque(id, qtde) == true){
                    estoqueService.retiradaEstoque(id, qtde);
                    System.out.println("\nEstoque atualizado!\n");
                    estoqueService.mostarEstoque();
                }
            }else if (opt > 7 || opt <= 0){
                System.out.println("\nOpção inválida! Digite novamente a opção desejada!");
            }
        } while (opt != 7);

        sc.close();
        name.close();

        System.out.println("\n======================================");
        System.out.println("OBRIGADO POR UTILIZAR O SISTEMA!");
        System.out.println("======================================\n");
    }
}