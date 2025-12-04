package composite;

public class Pedido {
    private Conteudo pedido;

    public String getPedido() {
        if(this.pedido == null){
            throw new NullPointerException("Impossível pedido sem prato principal");
        }
        return this.pedido.getConteudo();
    }

    public void setPedido(Conteudo pedido) {
        this.pedido = pedido;
    }
}
