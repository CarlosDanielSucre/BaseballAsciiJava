public class Carreras {
    private static int totalCarrerasVisitante;
    private static int totalCarrerasLocal;

    public static void carreras() {
        totalCarrerasVisitante = 0;
        totalCarrerasLocal = 0;

        for (int i = 0; i < 9; i++) {
            int coluna = 112 + i * 4;

            // Mostra sempre o valor salvo, mesmo que seja 0 (melhor para depurar)
            Juego.campoMatriz[9][coluna] = (char) ('0' + Juego.jogadorVisitante[i]);
            totalCarrerasVisitante += Juego.jogadorVisitante[i];

            Juego.campoMatriz[11][coluna] = (char) ('0' + Juego.jogadorLocal[i]);
            totalCarrerasLocal += Juego.jogadorLocal[i];
        }

        // Totais
        Juego.campoMatriz[9][148] = (char) ('0' + totalCarrerasVisitante);
        Juego.campoMatriz[11][148] = (char) ('0' + totalCarrerasLocal);
    }
    public static void marcarInningAtual() {
        // Limpa a linha de indicadores (linha 7)
        for (int i = 0; i < 9; i++) {
            int coluna = 112 + i * 4;
            Juego.campoMatriz[6][coluna] = ' ';
        }

        // Determina em que inning estamos
        int inningAtual = (int) Juego.inning; // 0.5 vira 0, 1.0 vira 1
        boolean topo = Juego.inning % 1 != 0; // true se estamos no topo do inning

        int colunaFlecha = 112 + inningAtual * 4;
        char flecha = topo ? 'V' : '^'; // Visitante ou Local

        Juego.campoMatriz[6][colunaFlecha] = flecha;
        Jogadas.identificarHombresEmBase(Juego.campoMatriz);
    }

    public static void aumentarCarreras() {


        int inningIndex = (int) Juego.inning;
        if(Juego.inning + Juego.inning == 1){
            Juego.jogadorVisitante[inningIndex]++;
        }else if ((Juego.inning + Juego.inning) %2 == 0) {
            Juego.jogadorVisitante[inningIndex]++;
        } else if ((Juego.inning + Juego.inning) %2 == 1) {
            Juego.jogadorLocal[inningIndex]++;

        }


    }

    public static void aumentarCarrerasHomeRun() {
        aumentarCarreras();
        if (Jogadas.hombreEmprimera) {
        aumentarCarreras();
            Jogadas.hombreEmprimera = false;
            Juego.campoMatriz[25][69] = ' ';   // primeira base

        }

        if (Jogadas.hombreEnSegunda) {
            aumentarCarreras();
            Jogadas.hombreEnSegunda = false;
            Juego.campoMatriz[20][44] = ' ';
        }
        if (Jogadas.hombreEnTercera) {
            aumentarCarreras();
            Jogadas.hombreEnTercera = false;
            Juego.campoMatriz[25][19] = ' ';
        }

    }
    public static void doble(){
        if (Jogadas.hombreEnTercera) {
            aumentarCarreras();
            Jogadas.hombreEnTercera = false;
            Juego.campoMatriz[25][19] = ' ';   //Tercera base

        }
        if (Jogadas.hombreEnSegunda) {
            aumentarCarreras();
            Jogadas.hombreEnSegunda = false;
            Juego.campoMatriz[20][44] = ' '; //segunda base
        }
        if (Jogadas.hombreEmprimera) {
            Jogadas.hombreEnTercera = true;
            Jogadas.identificarHombresEmBase(Juego.campoMatriz);
            Jogadas.hombreEmprimera = false;
            Juego.campoMatriz[25][69] = ' ';   // primeira base
            Jogadas.identificarHombresEmBase(Juego.campoMatriz);
        }

        Jogadas.hombreEnSegunda = true;

        Jogadas.identificarHombresEmBase(Juego.campoMatriz);
    }

    public static void walk(){
        if (Jogadas.hombreEnTercera) {
            aumentarCarreras();
            Jogadas.hombreEnTercera = false;

        }
        if (Jogadas.hombreEnSegunda) {
            aumentarCarreras();
            Jogadas.hombreEnSegunda = false;
            Jogadas.hombreEnTercera = true;
        }
        if (Jogadas.hombreEmprimera) {
            Jogadas.hombreEnSegunda = true;
            Jogadas.hombreEmprimera = false;
        }

        Jogadas.hombreEmprimera = true;
        Jogadas.identificarHombresEmBase(Juego.campoMatriz);
    }

    public static void doblePlay(){


        if (Jogadas.hombreEnTercera && !Jogadas.hombreEnSegunda && !Jogadas.hombreEmprimera) {
            Jogadas.hombreEnTercera = false;
            Jogadas.hombreEmprimera = false;
        }

        if (Jogadas.hombreEnTercera && Jogadas.hombreEnSegunda && !Jogadas.hombreEmprimera) {

            Jogadas.hombreEnSegunda = false;
            if(Juego.outs < 2){
                aumentarCarreras();
                Jogadas.hombreEnTercera = false;
            }
            Jogadas.hombreEmprimera = false;

        }

        if (Jogadas.hombreEnTercera && Jogadas.hombreEnSegunda && Jogadas.hombreEmprimera) {
            Jogadas.hombreEnSegunda = false;
            Jogadas.hombreEmprimera = false;

        }
        if (!Jogadas.hombreEnTercera && Jogadas.hombreEnSegunda && Jogadas.hombreEmprimera) {
            Jogadas.hombreEnTercera = true;
            Jogadas.hombreEmprimera = false;
        }

        Jogadas.identificarHombresEmBase(Juego.campoMatriz);



    }
    public static void triple(){
        if (Jogadas.hombreEmprimera) {
            aumentarCarreras();
            Jogadas.hombreEmprimera = false;
        }

        if (Jogadas.hombreEnSegunda) {
            aumentarCarreras();
            Jogadas.hombreEnSegunda = false;
        }
        if (Jogadas.hombreEnTercera) {
            aumentarCarreras();
            Jogadas.hombreEnTercera = false;
        }
        Jogadas.hombreEnTercera  = true;
        Jogadas.identificarHombresEmBase(Juego.campoMatriz);
    }




}
