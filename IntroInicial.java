public class IntroInicial {
    public static void introInicial() {
        TelasDeInicio telasDeInicio = new TelasDeInicio();

        for (int i = 0; i < telasDeInicio.telas.length; i++) {
            StringBuilder frame = new StringBuilder();

            for (String linha : telasDeInicio.telas[i]) {
                frame.append(linha).append("\n");
            }

            System.out.print(frame.toString());

            try {
                Thread.sleep(300); // ou 100ms para mais rapidez
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.print("\033[H"); // Mueve el cursor para arriba
            System.out.flush();
        }
    }
}
