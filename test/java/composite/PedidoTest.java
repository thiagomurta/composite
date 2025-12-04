package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPedido(){
        PratoPrincipal prato1 = new PratoPrincipal("Tropeiro");

        PratoPrincipal prato2 = new PratoPrincipal("Feijoada");
        Sobremesa sobremesa1 = new Sobremesa("Doce de Leite");
        Sobremesa sobremesa2 = new Sobremesa("Paçoca");
        prato2.addConteudo(sobremesa1);
        prato2.addConteudo(sobremesa2);

        PratoPrincipal pedido = new PratoPrincipal("Pedido:");
        pedido.addConteudo(prato1);
        pedido.addConteudo(prato2);

        Pedido pedidoCompleto = new Pedido();
        pedidoCompleto.setPedido(pedido);

        assertEquals("Pedido:\n" +
                        "Tropeiro\n" +
                        "Feijoada\n" +
                        "Sobremesa: Doce de Leite\n" +
                        "Sobremesa: Paçoca\n"
                , pedidoCompleto.getPedido());
    }

    @Test
    void deveRetornarErro(){
        try{
            Pedido pedido = new Pedido();
            pedido.getPedido();
            fail();
        }catch (NullPointerException e){
            assertEquals("Impossível pedido sem prato principal", e.getMessage());
        }

    }

}