//import java.util.Random;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void trocarCanal() {
        //Random aleatorio = new Random();

        //canal = aleatorio.nextInt(15);
        for(int i = 0; i <= 5; i++){
            System.out.println("Canal Chato Muda...");
            canal++;
        }
    }

    public void aumentarVolume() {
        volume += 1;
    }
    public void diminuirVolume() {
        volume -= 1;
    }

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}