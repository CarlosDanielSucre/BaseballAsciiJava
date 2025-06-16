import java.util.Random;

import java.util.Random;

public class Dados {

    private static final Random random = new Random();
    private final char[][][] faces = new char[6][3][5];

    public Dados() {
        faces[0] = new char[][]{
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}
        };
        faces[1] = new char[][]{
                {'*', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', '*'}
        };
        faces[2] = new char[][]{
                {'*', ' ', ' ', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', ' ', '*'}
        };
        faces[3] = new char[][]{
                {'*', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', ' ', ' '},
                {'*', ' ', ' ', ' ', '*'}
        };
        faces[4] = new char[][]{
                {'*', ' ', ' ', ' ', '*'},
                {' ', ' ', '*', ' ', ' '},
                {'*', ' ', ' ', ' ', '*'}
        };
        faces[5] = new char[][]{
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'}
        };
    }

    public static int rolar(int lados) {
        return random.nextInt(lados) + 1;
    }

    public void desenharDoisDados(char[][] campo, int linha, int coluna, int dado1, int dado2) throws InterruptedException {
        // Primeiro dado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                campo[linha + i][coluna + j] = faces[dado1 - 1][i][j];
            }
        }
        //Llamar a frases Dados

        FrasesDados frase = new FrasesDados();

        FrasesDados.escreverFraseDado(campo,dado1, dado2);

        // Segundo dado
        int offset = coluna + 7;
        for (int i = 0; i < 3; i++) {
            campo[linha + i][offset - 1] = '|';
            campo[linha + i][offset + 5] = '|';
            for (int j = 0; j < 5; j++) {
                campo[linha + i][offset + j] = faces[dado2 - 1][i][j];
            }
        }
    }
    public static void transicionDados() {
        Dados dado = new Dados();
        Random random = new Random();

        // Número de quadros (frames) da transição
        int frames = 12;

        for (int i = 0; i < frames; i++) {
            int tempDado1 = random.nextInt(6) + 1;
            int tempDado2 = random.nextInt(6) + 1;

            try {
                dado.desenharDoisDados(Juego.campoMatriz, 26, 120, tempDado1, tempDado2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Redesenha o campo com os dados temporários
            StringBuilder sb = new StringBuilder();
            for (char[] linha : Juego.campoMatriz) {
                sb.append(linha).append('\n');
            }

            Juego.limparTerminal(); // Certifique-se de ter esse método para limpar o console
            System.out.print(sb.toString());

            try {
                Thread.sleep(100); // Pausa de 100ms entre os quadros
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
