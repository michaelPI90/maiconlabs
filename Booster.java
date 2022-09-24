

public class Booster extends Item{
    private int duracao;

    public Booster() {
    }

    public Booster(int duracao) {
        this.duracao = duracao;
    }

    public Booster(int posicaoX, int posicaoY, int duracao) {
        super(posicaoX, posicaoY);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao > 0)
        this.duracao = duracao;
    }

    
    
}
