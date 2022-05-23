package nfilho.strategy;


// @author nfilho
public class strategyMain {

    public static void main(String[] args){

        comportamento normal = new comportamentoNormal();
        comportamento agressivo = new comportamentoAgressivo();
        comportamento defensivo = new comportamentoDefensivo();



        robo Sputnick = new robo();
        Sputnick.setComportamento(normal);
        for(int i = 0; i < 2; i++)
            Sputnick.move();

        // Mudando para defensivo
        Sputnick.setComportamento(defensivo);
        for (int i = 0; i < 3; i++)
            Sputnick.move();

        // Mudando para agressivo
        Sputnick.setComportamento(agressivo);
        for (int i = 0; i < 2; i++)
            Sputnick.move();
    }
}
