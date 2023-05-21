public class Mercado implements Loja {
    private String nome;
    private String endereco;

    public Mercado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirMercado(this);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
