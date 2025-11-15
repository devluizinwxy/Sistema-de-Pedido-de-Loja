import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itemPedidos = new ArrayList<>();

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }
    public void addItems (ItemPedido itemPedido){
        itemPedidos.add(itemPedido);
    }
    public BigDecimal total(){
        BigDecimal valorTotal = itemPedidos.stream().map(pedido -> pedido.getProduto().getPreco().multiply(BigDecimal.valueOf(pedido.getQuantidade())))
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        return valorTotal;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pedido \n");
        for (ItemPedido pedido : itemPedidos){
            stringBuilder.append(pedido);
        }
        stringBuilder.append("Total do pedido: ").append(total().toString());
        return stringBuilder.toString();
    }
}
