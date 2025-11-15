public class ItemPedido {
    private Produto produto;
    private Integer quantidade;

    public ItemPedido(Produto produto, Integer quantidade) {
        if (produto == null)throw new IllegalArgumentException("O produto não pode ser nulo!!");
        this.produto = produto;
        if (quantidade <=0 )throw new IllegalArgumentException("A quantidade não pode ser 0 ou menor que 0!!");
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getQuantidade()).append("x ").append(getProduto().getNome()).append(" - ").append(getProduto().getPreco()).append(" Cada\n");
        return stringBuilder.toString();
    }
}
