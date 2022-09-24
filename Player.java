

public class Player extends GameObject{
    private int life;
    private int direction;

    public Player() {
        
    }

    public Player(int posicaoX, int posicaoY, int direction) {
        super(posicaoX, posicaoY);
        this.direction = direction;
    }

    public int mover (int posicao, int direcao){
        if( direction == 270){
            posicao -= 10;
        } 
        if(direction == 90){
            posicao += 10;
        }
        if(direction == 0){
            posicao -= 10;
        }
        if(direction == 180){
            posicao += 10;
        }
        return posicao;

        
    
    }
// 
public boolean podesemover(int posicaoA, int posicaoB, int direction){
    int posciaoFinal;
    int result = 0;
    int direcaoJogador ;
   
  posciaoFinal =  posicaoA+posicaoB;

switch (direction) {
 case 270, 0 -> {
     direcaoJogador = -10;

 }
 case 90, 180 -> {
     direcaoJogador = 10;
  
 }
 default -> {
         System.out.println("Direção inválida");
         return false;
 }
}
 
 if( posciaoFinal + direcaoJogador  < getScreenSize()){
     result = posciaoFinal + direcaoJogador;
 }
     if(posciaoFinal + direcaoJogador > 0){
   
 } else{
      result = posciaoFinal + direcaoJogador;
    
     
 }



 return true;

}



        // if( posicaoX>=getScreenSize() || posicaoX<0 || posicaoY>=getScreenSize() || posicaoY<0){
        //     System.out.println("Posicao inválida");
        //     return false;
        // }
        // return true;



    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if(life > 0)
        this.life = life;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction){
            if(direction == 270 || direction == 0 || direction == 180 || direction == 90){
                this.direction = direction;
            }else {
                System.out.println("não pode esse valor");
            }
          
        }
    
 

}

