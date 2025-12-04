package composite;

import java.util.ArrayList;
import java.util.List;

public class Sobremesa extends Conteudo{

    private List<Conteudo> conteudos;

    public Sobremesa(String sobremesa){
        super(sobremesa);
    }

    @Override
    public String getConteudo() {
        return "Sobremesa: " + this.getDescricao() + "\n";
    }
}
