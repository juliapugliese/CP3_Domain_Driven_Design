package entities;

import java.util.StringJoiner;

public class Produto extends _BaseEntity {
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
    private int quantidade;

    public Produto(){}

    public Produto(int id, String nome, String descricao, double preco, int estoque) {
        super(id);
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(int id, String nome, String descricao, double preco, int estoque, int quantidade) {
        super(id);
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Produto.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("descricao='" + descricao + "'")
                .add("preco=" + preco)
                .add("estoque=" + estoque)
                .add("id=" + getId())
                .add("quantidade=" + quantidade)
                .toString();
    }
}
