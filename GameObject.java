

public class GameObject {
    private int posicaoX;
    private int posicaoY;
    private int screenSize;

    public GameObject() {
    }

    

    public GameObject(int posicaoX, int posicaoY) {
        if(posicaoX < 0 || posicaoY < 0) {
            System.out.println("Posição inválida");
        }else{
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        }
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        if(posicaoX > 0)  {
            this.posicaoX = posicaoX;
        }else{
            System.out.println("Posição inválida");
        }
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        if(posicaoY < 0) {
            System.out.println("Posição inválida");
        }else{
        this.posicaoY = posicaoY;
    }
}

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int tamTela) {
        if(tamTela < 0) {
            System.out.println("Posição inválida");
        }else{
        this.screenSize = tamTela;
        }
}

    public int getY() {
        return 0;
    }

    public int getX() {
        return 0;
    }

}
