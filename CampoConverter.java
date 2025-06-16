public class CampoConverter {

    public static char[][] converterParaMatriz(String[] linhas) {
        int linhasQtd = linhas.length;
        int colunasQtd = linhas[0].length(); // Assume que todas têm o mesmo tamanho

        char[][] matriz = new char[linhasQtd][colunasQtd];

        for (int i = 0; i < linhasQtd; i++) {
            for (int j = 0; j < colunasQtd; j++) {
                matriz[i][j] = linhas[i].charAt(j);
            }
        }

        return matriz;
    }
}