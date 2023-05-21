public class LojaVisitor implements Visitor {
    public String exibir(Loja loja) {
        return loja.aceitar(this);
    }

    @Override
    public String exibirMercado(Mercado mercado) {
        return "Mercado{" +
                "nome='" + mercado.getNome() + '\'' +
                ", endereco='" + mercado.getEndereco() + '\'' +
                '}';
    }

    @Override
    public String exibirFarmacia(Farmacia farmacia) {
        return "Farmacia{" +
                "nome='" + farmacia.getNome() + '\'' +
                ", telefone='" + farmacia.getTelefone() + '\'' +
                '}';
    }

    @Override
    public String exibirRestaurante(Restaurante restaurante) {
        return  "Restaurante{" +
                "nome='" + restaurante.getNome() + '\'' +
                ", endereco='" + restaurante.getEndereco() + '\'' +
                ", cardapio='" + restaurante.getCardapio() + '\'' +
                '}';
    }
}
