package spring.java_puro.entities;

public class Pedido {
    private final long numeroPedido;
    private final Produto produto;
    private double preco;

    public Pedido(long numeroPedido, Produto produto, int preco) {
        this.numeroPedido = numeroPedido;
        this.produto = produto;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "entities.Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", produto='" + produto + '\'' +
                ", preco=" + preco +
                '}';
    }
}
