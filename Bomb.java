

public class Bomb extends Item {
    public Bomb() {
    }



    

    public Bomb(int i, int j) {
    }





    public void setBomba(boolean bomba) {
        if(bomba) {
        }
    }

    
    public int mataVidas(Player player, Bomb posicao){
        int receba = 0;
        if(player.getPosicaoX() == posicao.getPosicaoX()){
             receba = player.getLife() - 10;
        }

    
    
    return receba;
}

}


