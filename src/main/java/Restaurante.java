public class Restaurante implements Loja {
    private String nome;
    private String endereco;
    private String cardapio;

    public Restaurante(String nome, String endereco, String cardapio) {
        this.nome = nome;
        this.endereco = endereco;
        this.cardapio = cardapio;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirRestaurante(this);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCardapio() {
        return cardapio;
    }
}