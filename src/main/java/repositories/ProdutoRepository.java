package repositories;

import entities.Produto;
import entities.Venda;

import java.util.List;

public class ProdutoRepository extends _BaseRepositoryImpl<Produto>{
    public Produto findByTitle(String title){
        return entities.stream()
                .filter(e -> e.getNome().contains(title))
                .findFirst()
                .orElse(null);
    }

    public List<Produto> findAllByTitle(String title){
        return entities.stream()
                .filter(e -> e.getNome().contains(title))
                .toList();
    }
}
