package entities;

import java.time.LocalDateTime;
import java.util.*;


public class Venda extends _BaseEntity {
    private transient Cliente cliente;
    private List<Produto> itensVenda = new ArrayList<>();
    private Date data = new Date();
    private double valorTotal;

    public Venda(){
    }

    public Venda(int id, Cliente cliente, List<Produto> itensVenda) {
        super(id);
        this.cliente = cliente;
        this.itensVenda = itensVenda;
        this.data = getData();
        this.valorTotal = calcular_total();
        cliente.adicionarCompraAoHistorico(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<Produto> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return new StringJoiner(", \n", Venda.class.getSimpleName() + "[", "] \n")
                .add("cliente = " + cliente.getId())
                .add("itensVenda = " + removerItensDuplicados())
                .add("data = " + data)
                .add("valorTotal = " + valorTotal)
                .add("id = " + getId())
                .toString();
    }

    public double calcular_total(){
        return itensVenda.stream().mapToDouble(Produto::getPreco).sum();
    }
    public List<Produto> removerItensDuplicados(){

        ArrayList<Produto> newList = new ArrayList<>();
        for (Produto element : itensVenda) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
            if (itensVenda.contains(element)){
                element.setQuantidade((int) itensVenda.stream().filter(produto -> produto == element).count());
            }
        }
//        System.out.println(newList);
        return newList;

    }



}
