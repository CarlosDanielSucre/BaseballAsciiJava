public class FrasesDados {

    public static void escreverFraseDado(char[][] campo, int dado1, int dado2) throws InterruptedException {



        String[] espacoBranco = {
                "|                                   |",
                "|                                   |",
                "|                                   |",
                "|                                   |",
                "|                                   |",
                "|                                   |",
        };

        if (dado1 == 1 && dado2 == 1) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   HOME RUN:                       |",
                    "|EL BATEADOR RECORRE TODAS LAS BASES|",
                    "|  Y ANOTA PUNTO, CASO HAYA JUGADOR |",
                    "|  EN BASE, TAMBIEN ANOTA           |",
                    "|                                   |",
            };
        } else if (dado1 == 1 && dado2 == 2) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   DOUBLE:                         |",
                    "|EL BATEADOR LLEGA A LA SEGUNDA     |",
                    "|BASE. JUGADORES EN BASE AVANZAN DOS|",
                    "|BASES SI ES POSIBLE                |",
                    "|                                   |",
            };
        } else if (dado1 == 1 && dado2 == 3) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   FLY OUT:                        |",
                    "|BOLA ALTA CAPTURADA. EL BATEADOR   |",
                    "|ESTA FUERA. CORREDORES NO AVANZAN  |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 1 && dado2 == 4) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   WALK BASE x B:                  |",
                    "|BATEADOR CAMINA A LA PRIMERA BASE  |",
                    "|CORREDORES AVANZAN SI ESTAN        |",
                    "|          BLOQUEADOS               |",
                    "|                                   |",
            };
        } else if (dado1 == 1 && dado2 == 5) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   POP OUT:                        |",
                    "|BOLA ALTA INTERIOR CAPTURADA. OUT  |",
                    "|NINGUN JUGADOR AVANZA              |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 1 && dado2 == 6) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   SINGLE HIT:                     |",
                    "|BATEADOR ALCANZA PRIMERA BASE      |",
                    "|CORREDORES AVANZAN UMA BASE        |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 2 && dado2 == 2) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   DOUBLE PLAY:                    |",
                    "|DOS OUTS EN UNA SOLA JUGADA        |",
                    "|EL EQUIPO A LA DEFENSA BRILLA,     |",
                    "|  CASO NO TENGA CORREDORES EN BASE |",
                    "|      SOLO SERA UN OUT             |",
            };
        } else if (dado1 == 2 && dado2 == 3) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   DOUBLE:                         |",
                    "|BATEADOR CHEGA A SEGUNDA BASE      |",
                    "|CORREDORES AVANZAN 2 BASES         |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 2 && dado2 == 4) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   STRIKE OUT:                     |",
                    "|TRES STRIKES. BATEADOR ESTA FUERA  |",
                    "|SIN AVANCE EN LAS BASES            |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 2 && dado2 == 5) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   SINGLE HIT:                     |",
                    "|BATEADOR CHEGA A PRIMEIRA BASE     |",
                    "|CORREDORES AVANZAN UNA BASE        |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 2 && dado2 == 6) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   STRIKE OUT:                     |",
                    "|O BATEDOR FALHOU EM ACERTAR A BOLA |",
                    "|E ESTA ELIMINADO. NINGUEM AVANZA   |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 3 && dado2 == 3) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   WALK BASE x B:                  |",
                    "|BATEADOR CAMINA A LA PRIMERA BASE  |",
                    "|CORREDORES AVANZAN SI ESTAN        |",
                    "|          BLOQUEADOS               |",
                    "|                                   |",
            };
        } else if (dado1 == 3 && dado2 == 4) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   TRIPLE:                         |",
                    "|BATEDOR CHEGA A TERCEIRA BASE      |",
                    "|CORREDORES AVANZAN TODAS AS BASES  |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 3 && dado2 == 5) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   GROUND OUT:                     |",
                    "|BOLA RASTEIRA ELIMINA O BATEDOR    |",
                    "|                                   |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 3 && dado2 == 6) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   FLY OUT:                        |",
                    "|BOLA ALTA FOI PEGA  . BATEDOR OUT  |",
                    "|NINGUEM AVANZA NAS BASES           |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 4 && dado2 == 4) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|             WALK:                 |",
                    "|  BATEDOR CAMINHA PARA A PRIMEIRA  |",
                    "|     BASE. CORREDORES AVANZAM      |",
                    "|         SE BLOQUEADOS             |",
                    "|                                   |",
            };
        } else if (dado1 == 4 && dado2 == 5) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|         POP OUT:                  |",
                    "| BOLA CURTA FOI PEGA  . OUT        |",
                    "| NINGUEM AVANZA NAS BASES          |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 4 && dado2 == 6) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   STRIKE OUT:                     |",
                    "|O BATEDOR FOI ELIMINADO POR STRIKE |",
                    "| NINGUEM AVANZA NAS BASES          |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 5 && dado2 == 5) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|             GROUND OUT:           |",
                    "|    BOLA FOI DEFENDIDA EM TERRA    |",
                    "|         BATEDOR ESTA OUT          |",
                    "|                                   |",
                    "|                                   |",
            };
        } else if (dado1 == 5 && dado2 == 6) {
            espacoBranco = new String[]{
                    "|                                   |",
                    "|   HIT:                            |",
                    "|BATEDOR ACERTOU UM BOM CONTATO     |",
                    "|E CONSEGUIU AVANZAR NA BASE, SE    |",
                    "|   TIVER CORREDORES AVANZAN TAMBEM |",
                    "|                                   |",
            };
        } else if (dado1 == 6 && dado2 == 6) {
                espacoBranco = new String[]{
                        "|                                   |",
                        "|   HOME RUN:                       |",
                        "|EL BATEADOR RECORRE TODAS LAS BASES|",
                        "|  Y ANOTA PUNTO, CASO HAYA JUGADOR |",
                        "|  EN BASE, TAMBIEN ANOTA           |",
                        "|                                   |",
                };
        }


        char[][] matriz = CampoConverter.converterParaMatriz(espacoBranco);


        for(int i = 0; i < matriz.length;i++ ){

            for(int j = 0; j < matriz[0].length;j++){
                campo[30 + i][107 + j ] = matriz[i][j];
            }
            desenharCampo(Juego.campoMatriz);
            Thread.sleep(1);
        }
    }
    public static void desenharCampo(char[][] campo) {
        StringBuilder sb = new StringBuilder();

        // Limpa a tela (código ANSI)
        sb.append("\033[H\033[2J");

        for (char[] linha : campo) {
            sb.append(linha);
            sb.append('\n');
        }

        System.out.print(sb.toString());
        System.out.flush();
    }
}
