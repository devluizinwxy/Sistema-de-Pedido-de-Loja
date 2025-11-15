import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        if (nome == null || nome.isBlank())throw new IllegalArgumentException("O nome não pode ser vazio!!");
        if (nome.matches("^\\P{Lu}\\.*"))throw new IllegalArgumentException("O nome do produto precisa começar com letra maiuscula!!!");
        nome = nome.trim();
        this.nome = nome;
        if (preco == null)throw new IllegalArgumentException("O preço não pode ser nulo");
        if (preco.compareTo(BigDecimal.ZERO) <= 0)throw new IllegalArgumentException("O preço não pode ser menor  ou igual  a  zero!!!");
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
