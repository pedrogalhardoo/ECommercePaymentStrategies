package com.mycompany.ecommercepaymentstrategies;


public class ECommercePaymentStrategies {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Livro", 50.0));
        carrinho.adicionaItem(new Item("Caneta", 5.0));

        // Definindo a estratégia de pagamento como Pix
        carrinho.realizaPagamento(new PixPagamento());

        // Se quiséssemos mudar para outra forma de pagamento:
        // carrinho.realizaPagamento(new CartaoPagamento());
        // carrinho.realizaPagamento(new BoletoPagamento());
    }
}
