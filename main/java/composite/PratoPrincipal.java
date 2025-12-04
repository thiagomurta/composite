package composite;

import java.util.ArrayList;
import java.util.List;

public class PratoPrincipal extends Conteudo{
    private List<Conteudo> conteudos;

    public PratoPrincipal(String pratoPrincipal){
        super(pratoPrincipal);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    @Override
    public String getConteudo() {
        String saida = "";
        saida = this.getDescricao() + "\n";
        for(Conteudo conteudo: conteudos){
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
