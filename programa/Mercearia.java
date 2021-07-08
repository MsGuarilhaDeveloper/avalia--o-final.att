package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Produto;

public class Mercearia {

    public static void main(String[] args) {
        int opcao;
        List<Produto> produtos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        
        do {
             System.out.println("\n****\nMENU\n****\n");
             System.out.println("1 – Incluir produto");
             System.out.println("2 – Consultar produto");
             System.out.println("3 – Listagem de produtos");
             System.out.println("4 – Vendas por período – detalhado");
             System.out.println("5 – Realizar venda");
             System.out.println("0 – Sair");
             System.out.print("Opção ");

             opcao = ler.nextInt();
             ler.nextLine();

             if(opcao == 1){
                
                Produto produto = new Produto();

                System.out.print("\nCadastro de Produtos\n");

                System.out.print("Código: ");
                produto.setCodigo(ler.nextInt());

                System.out.println("Nome: ");
                produto.setNome(ler.nextLine());
              //  ler.nextInt();

                System.out.print("Valor: ");
                produto.setValor(ler.nextFloat());

                System.out.print("Quantidade: ");
                produto.setQuantidadeEstoque(ler.nextInt());

                
               produtos.add(produto);

                System.out.println("\nProduto cadastrado com sucesso.");
                voltarMenu(ler);

            
            
            } else if(opcao == 2){
                 
                 
                    if(produtos.size() == 0){
                        System.out.println("\n Não há produtos cadastrados para exibir");
                        voltarMenu(ler);
                        continue;
                    }

                    System.out.println("Informe o código do produto: ");
                    int buscarCodigo = ler.nextInt();
                    System.out.println("=======================\n");



                    for (var produto : produtos) {
                        if(buscarCodigo == produto.getCodigo()){
                            System.out.println("Produto encontrado");
                            System.out.println("=======================");
                            System.out.println("Código: " + produto.getCodigo());
                            System.out.println("Nome " + produto.getNome());
                            System.out.println("=======================");
                        }
                    }


                

            } else if(opcao == 3){

                if (produtos.size() == 0) {
                        System.out.println("\nNão há produtos cadastrados para exibir.");
                        voltarMenu(ler);
                        continue;
                    }
                   
                    System.out.println("\nPRODUTOS CADASTRADOS:");
                    System.out.println("***********************");
                    System.out.println("\nListagem de Produtos:\n");

                    produtos.forEach((produto) -> {
                        System.out.println("\n");                       
                        System.out.println("-----------------------------");
                        System.out.println("Código: " + produto.getCodigo());
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Valor Unitário: " + produto.getValor());
                        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
                        System.out.println("-----------------------------");
                    });
            } else if(opcao == 4){

            } else if(opcao == 5){

                int produtoCadastrado;
                Boolean achei = false;
                int quantidade;

                System.out.println("Insira o código do produto cadastrado\n: ");
                produtoCadastrado = ler.nextInt();    
                
                System.out.println("Quantidade ");
                quantidade = ler.nextInt();
                

                for ( var produto : produtos) {
                    if( produtoCadastrado == (produto.getCodigo())){
                        achei = true;
                        produto.removerQuantidadeEstoque(quantidade);
                        System.out.println("\nVenda realizada com sucesso!!!");               
                    }
                                     
                }


            }


             

        } while (opcao != 0);






    }

    private static void voltarMenu(Scanner ler) {
    }


    
}
