import entities.Cliente;
import entities.Produto;
import entities.Venda;
import repositories.ClienteRepository;
import repositories.ProdutoRepository;
import repositories.VendaRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var vendaRepo = new VendaRepository();

        var clienteRepo = new ClienteRepository();

        var produtoRepo = new ProdutoRepository();


        var produto1 = new Produto(1, "locao para abarbear", "refrescante", 19, 80);
        var produto2 = new Produto(2, "escova alisadora", "não deixa frizz", 200, 10);
        var produto3 = new Produto(3, "creme de pentear", "brilho total", 36, 40);


        var cliente1 = new Cliente(1, "Elisangela", "@", "Rua", 666553512);
        var cliente2 = new Cliente(2, "Viviane", "@", "Rua", 586415212);


        var venda1 = new Venda(1, cliente1, List.of(produto3, produto1, produto2, produto2, produto1, produto3, produto2));
        var venda2 = new Venda(2, cliente2, List.of(produto1, produto3, produto3));


        produtoRepo.Create(produto1);
        produtoRepo.Create(produto2);
        produtoRepo.Create(produto3);

        System.out.println(produtoRepo.ReadAll());
        System.out.println("\n");



        System.out.println(venda1);
        System.out.println("\n");

        System.out.println(venda2);
        System.out.println("\n");


        System.out.println("Cliente 1 " + cliente1);
        System.out.println("\n");




        vendaRepo.Create(venda1);
        vendaRepo.Create(venda2);




        System.out.println(cliente1);
        System.out.println("\n");


        clienteRepo.Create(cliente1);



        System.out.println(vendaRepo.ReadAll());
        System.out.println("\n");


        var venda4 = new Venda(1, cliente1, List.of(produto3, produto2));

        vendaRepo.Update(venda4);
        System.out.println("Venda repositorio "+vendaRepo.ReadAll());
        System.out.println("\n");


        vendaRepo.exportToJson();

        System.out.println("Cliente 1 " + cliente1+ "\n");


        System.out.println("Cliente repositorio "+clienteRepo.ReadAll());
        System.out.println("\n");


        clienteRepo.DeleteByName(cliente1);
        System.out.println("Cliente repositorio "+clienteRepo.ReadAll()+"\n");


    }

}
