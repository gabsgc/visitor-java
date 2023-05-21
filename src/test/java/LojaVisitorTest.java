import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaVisitorTest {
    @Test
    void deveExibirFarmancia() {
        Farmacia farmacia = new Farmacia("Drogaria Popular", "2124717777");

        LojaVisitor visitor = new LojaVisitor();

        assertEquals("Farmacia{nome='Drogaria Popular', telefone='2124717777'}", visitor.exibir(farmacia));
    }

    @Test
    void deveExibirMercado() {
        Mercado mercado = new Mercado("Supermercado Tem Tudo", "Rua A");

        LojaVisitor visitor = new LojaVisitor();

        assertEquals("Mercado{nome='Supermercado Tem Tudo', endereco='Rua A'}", visitor.exibir(mercado));
    }

    @Test
    void deveExibirRestaurante() {
        Restaurante restaurante = new Restaurante("O Melhor Sabor", "Rua A",
                "Strogonoff de frango");

        LojaVisitor visitor = new LojaVisitor();

        assertEquals("Restaurante{nome='O Melhor Sabor', endereco='Rua A', cardapio='Strogonoff de frango'}",
                visitor.exibir(restaurante));
    }
}