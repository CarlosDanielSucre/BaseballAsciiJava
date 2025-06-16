import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {


        Juego jogo = new Juego();
        IntroInicial.introInicial();
        jogo.iniciarJuego();
        jogo.juego();



    }
}
