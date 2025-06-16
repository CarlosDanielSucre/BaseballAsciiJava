import java.util.Scanner;

public class Juego {
    public static void limparTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    Scanner sc = new Scanner(System.in);

    public static int[] jogadorVisitante = new int[9];
    public static int[] jogadorLocal = new int[9] ;

    Dados dado = new Dados();
    public static char[][] campoMatriz = Campo.obterCampoComoMatriz();
    public static double inning = 0.5;
    public static int outs = 0;

    public void iniciarJuego() {


        System.out.print("\033[H\033[2J"); //limpar a tela
        System.out.flush();

        //Llamar la pantalla con reglas
        TelaDeRegras telaDeRegras = new TelaDeRegras();
        telaDeRegras.imprimirTelaRegras();

        //campo de Juego incial


        StringBuilder sb = new StringBuilder();

        for (char[] linha : campoMatriz) {
            sb.append(linha); // Adiciona todos os caracteres da linha
            sb.append('\n');  // Adiciona quebra de linha
        }


        System.out.print(sb.toString());
        System.out.print(">>> Pressione ENTER para Jogar os Dados...");
        sc.nextLine();


    }
    public int dado1, dado2;

    public void juego() {
        StringBuilder sb = new StringBuilder();
        Juego.inning = 0.0; // Começar no topo da primeira entrada

        while (inning <= 9) {
            outs = 0;
            Jogadas.hombreEmprimera = false;
            Jogadas.hombreEnSegunda = false;
            Jogadas.hombreEnTercera = false;

            Jogadas.limpiarBases(campoMatriz);
            Jogadas.limparOuts(campoMatriz); // limpa contadores visuais
            Carreras.carreras(); // atualiza placar (opcional aqui, pode ir só depois)
            Carreras.marcarInningAtual(); // marca a flecha de entrada atual

            while (outs < 3) {
                // Rolar dados
                dado1 = Dados.rolar(6);
                dado2 = Dados.rolar(6);
                int d1 = Math.min(dado1, dado2);
                int d2 = Math.max(dado1, dado2);

                try {
                    dado.desenharDoisDados(campoMatriz, 26, 120, d1, d2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                // Executar jogada com os dados
                Jogadas.verificarJogada(d1, d2, campoMatriz);

                // Atualiza a flecha de inning e placar depois da jogada
                Carreras.marcarInningAtual();
                Carreras.carreras();

                // Montar o campo após tudo
                sb.setLength(0);
                for (char[] linha : campoMatriz) {
                    sb.append(linha);
                    sb.append('\n');
                }

                limparTerminal();
                System.out.print(sb.toString());

                // Espera ENTER para mostrar o resultado da jogada seguinte
                sc.nextLine();
                Dados.transicionDados();
            }

            // Após 3 outs, avança para próximo meio-inning
            inning += 0.5;
        }
    }
    }


