import java.util.Scanner;

public class Jogadas {

    public static boolean hombreEmprimera = false, hombreEnSegunda = false, hombreEnTercera = false;
    public static boolean antesEmPrimeira = false, antesEmSegunda = false, antesEmTerceira = false;

    public static void identificarHombresEmBase(char[][] matriz){
        if((Juego.inning + Juego.inning)%2 == 1){
            if(hombreEmprimera){
                matriz[25][69] = 'O';
            }
            if(hombreEnSegunda){
                matriz[20][44] = 'O';
            }
            if(hombreEnTercera){
                matriz[25][19] = 'O';
            }
            matriz[37][42] = 'O';

        }else if((Juego.inning + Juego.inning)%2 == 0){
            if(hombreEmprimera){
                matriz[25][69] = 'X';
            }
            if(hombreEnSegunda){
                matriz[20][44] = 'X';
            }
            if(hombreEnTercera){
                matriz[25][19] = 'X';
            }
            matriz[37][42] = 'X';
        }

    }

    public static void limpiarBases(char[][] matriz){

        // Apaga os corredores nas posições conhecidas
        matriz[25][69] = ' ';   // primeira base
        matriz[20][44] = ' ';   // segunda base
        matriz[25][19] = ' ';   // terceira base

        // Zera o estado lógico
        hombreEmprimera = false;
        hombreEnSegunda = false;
        hombreEnTercera = false;


    }


    public static void verificarJogada(int d1, int d2, char[][] matriz){

        dibujarOuts(Juego.outs,matriz);
        System.out.println(Juego.outs);

        matriz[10][10] = (char) ('0' + Juego.outs);
        matriz[11][11] = '.';

        verificarCaso(d1,d2);


    }
    public static void dibujarOuts(int outs,char[][] matriz ){
        if(Juego.outs == 0){
            matriz[20][117] = '*';
        }else if(Juego.outs == 1){
            matriz[20][117] = '*';
            matriz[20][122] = '*';

        }else if(Juego.outs == 2){
            matriz[20][117] = '*';
            matriz[20][122] = '*';
            matriz[20][128] = '*';
        }


    }
    public static void limparOuts(char[][] matriz ){

            matriz[20][117] = ' ';
            matriz[20][122] = ' ';
            matriz[20][128] = ' ';

    }

    public static void verificarCaso(int dado1, int dado2){
        if (dado1 == 1 && dado2 == 1) {
            // HOME RUN
            Carreras.aumentarCarrerasHomeRun();

        } else if (dado1 == 1 && dado2 == 2) {
            // DOUBLE
            Carreras.doble();

        } else if (dado1 == 1 && dado2 == 3) {
            // FLY OUT
            Juego.outs++;
        } else if (dado1 == 1 && dado2 == 4) {

            // WALK BASE x B
            Carreras.walk();
        } else if (dado1 == 1 && dado2 == 5) {
            // POP OUT
            Juego.outs++;
        } else if (dado1 == 1 && dado2 == 6) {

            // SINGLE HIT
            Carreras.walk();
        } else if (dado1 == 2 && dado2 == 2) {
            // DOUBLE PLAY (só se houver corredores em base)
            Juego.outs += 2;
            Carreras.doblePlay();
        } else if (dado1 == 2 && dado2 == 3) {

            // DOUBLE
            Carreras.doble();
        } else if (dado1 == 2 && dado2 == 4) {
            // STRIKE OUT
            Juego.outs++;

        } else if (dado1 == 2 && dado2 == 5) {
            // SINGLE HIT
            Carreras.walk();
        } else if (dado1 == 2 && dado2 == 6) {
            // STRIKE OUT
            Juego.outs++;
        } else if (dado1 == 3 && dado2 == 3) {
            // WALK BASE x B
            Carreras.walk();
        } else if (dado1 == 3 && dado2 == 4) {
            // TRIPLE
            Carreras.triple();
        } else if (dado1 == 3 && dado2 == 5) {
            // GROUND OUT
            Juego.outs++;
        } else if (dado1 == 3 && dado2 == 6) {
            // FLY OUT
            Juego.outs++;
        } else if (dado1 == 4 && dado2 == 4) {
            // WALK
            Carreras.walk();
        } else if (dado1 == 4 && dado2 == 5) {
            // POP OUT
            Juego.outs++;
        } else if (dado1 == 4 && dado2 == 6) {
            // STRIKE OUT

            Juego.outs++;
        } else if (dado1 == 5 && dado2 == 5) {
            // GROUND OUT
            Juego.outs++;
        } else if (dado1 == 5 && dado2 == 6) {
            // HIT
            Carreras.walk();
        } else if (dado1 == 6 && dado2 == 6) {
            // HOME RUN
            Carreras.aumentarCarrerasHomeRun();
        } else {
            // Jogada não identificada
        }
    }



}
