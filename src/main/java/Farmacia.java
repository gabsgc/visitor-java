public class Farmacia implements Loja {
    private String nome;
    private String telefone;

    public Farmacia(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirFarmacia(this);
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}