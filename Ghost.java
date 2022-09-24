

import java.util.Random;

public class Ghost extends GameObject  {

private int direcao;
    

    public Ghost() {
    }

    
   
    public Ghost(int posicaoX, int posicaoY, int direcao) {
        super(posicaoX, posicaoY);
        this.direcao = direcao;
    }



    public boolean mover (int posicao){
        Random aleatorio = new Random();
        direcao = aleatorio.nextInt(5) ;
            if (direcao == 270 || direcao == 90 || direcao == 0 || direcao == 180){
           
            }
            switch (direcao) {
                case 270, 0 -> {
                    direcao = -10;
                    System.out.println("moevndo pro outro lado " + direcao);
                }
                case 90, 180 -> {
                    direcao = 10;
                    System.out.println("movendo " + direcao);
                }
                default -> {
                        System.out.println("Direção inválida");
                        return false;
                }
            }
            return true;

        }

    //     if( direcao == 270){
    //         posicao = -10;
    //     } 
    //     if(direcao == 90){
    //         posicao += 10;
    //     }
    //     if(direcao == 0){
    //         posicao -= 10;
    //     }
    //     if(direcao == 180){
    //         posicao += 10;
    //     }
    //     return posicao;
    // }




    public int getDirecao() {
        return direcao;
    }



    public void setDirecao(int direcao) {
        if(direcao == 270 || direcao == 0 || direcao == 180 || direcao == 90)
        this.direcao = direcao;

    }





}


    

