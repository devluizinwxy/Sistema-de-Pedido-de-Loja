import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {


           Pedido pedido = new Pedido();
           System.out.print("Quantos itens no pedido? ");
           int qnt = sc.nextInt();
           sc.nextLine();

           for (int i = 0; i < qnt; i++) {
               System.out.println("Produto #" + (i + 1) + ": ");
               System.out.print("Nome: ");
               String nome = sc.nextLine();
               System.out.print("Preço: ");
               BigDecimal preco = sc.nextBigDecimal();
               System.out.print("Quantidade: ");
               Integer quantidade = sc.nextInt();
               sc.nextLine();

               ItemPedido pedido1 = new ItemPedido(new Produto(nome, preco), quantidade);
               pedido.addItems(pedido1);

           }
           System.out.println(pedido);
       }catch (IllegalArgumentException e){
           System.out.println("Erro: "+ e.getMessage());
       }catch (InputMismatchException inputMismatchException){
           System.out.println(" Valor inválido! Digite apenas números inteiros."+ inputMismatchException.getMessage());
       }

    }
}