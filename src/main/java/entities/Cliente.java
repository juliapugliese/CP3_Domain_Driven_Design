package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Cliente extends _BaseEntity{
    private String nome;
    private String email;
    private String endereco;
    private int cpf;
    private List<Venda> historicoDeCompras = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int id, String nome, String email, String endereco, int cpf) {
        super(id);
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.historicoDeCompras = getHistoricoDeCompras();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<Venda> getHistoricoDeCompras() {
        return historicoDeCompras;
    }

    public void setHistoricoDeCompras(List<Venda> historicoDeCompras) {
        this.historicoDeCompras = historicoDeCompras;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cliente.class.getSimpleName() + "[", "]")
                .add("id = " + getId())
                .add("nome = '" + nome + "'")
                .add("email = '" + email + "'")
                .add("endereco = '" + endereco + "'")
                .add("cpf = " + cpf)
                .add("historicoDeCompras = " + historicoDeCompras)
                .toString();
    }

    public void adicionarCompraAoHistorico(Venda venda){
        historicoDeCompras.add(venda);
    }



}
