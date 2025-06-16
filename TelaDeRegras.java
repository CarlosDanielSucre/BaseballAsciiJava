import java.util.Scanner;

public class TelaDeRegras {
    String[] regras = {
            "############################################################################################################################################################",
            "############################################################################################################################################################",
            "############################################################################################################################################################",
            "#####                                                                                                                                                  #####",
            "#####                                              [[ BEM-VINDO AO BASEBALL DE DADOS ]]                                                                #####",
            "#####                                                                                                                                                  #####",
            "#####     -> O jogo e simples: cada jogada e decidida com base no lancamento de dois dados!                                                            #####",
            "#####                                                                                                                                                  #####",
            "#####     [] TABELA DE RESULTADOS:                                                                                                                     #####",
            "#####                                                                                                                                                  #####",
            "#####             [1][1]  Home Run               [1][6]  Single Hit              [2][6]  Strike Out                 [4][4]  Walk                       #####",
            "#####             [1][2]  Double                 [2][2]  Double Play             [3][3]  Walk B x B                 [4][5]  Pop Out                    #####",
            "#####             [1][3]  Fly Out                [2][3]  Double                  [3][4]  Triple                     [4][6]  Strike Out                 #####",
            "#####             [1][4]  Walk B x B             [2][4]  Strike Out              [3][5]  Ground Out                 [5][5]  Ground Out                 #####",
            "#####             [1][5]  Pop Out                [2][5]  Single Hit              [3][6]  Fly Out                    [5][6]  Hit                        #####",
            "#####                                                                                                               [6][6]  Home Run                   #####",
            "#####                                                                                                                                                  #####",
            "#####                                                                                                                                                  #####",
            "#####     {} REGRAS BASICAS:                                                                                                                           #####",
            "#####                                                                                                                                                  #####",
            "#####       - 3 Outs encerram uma entrada.                                                                                                             #####",
            "#####       - Jogadores avancam automaticamente pelas bases com os hits.                                                                               #####",
            "#####       - O placar e atualizado a cada jogada.                                                                                                     #####",
            "#####       - O jogo pode ser LOCAL x VISITANTE com placar visivel.                                                                                    #####",
            "#####                                                                                                                                                  #####",
            "#####                                     Pressione ENTER para lancar os dados e comecar a partida!                                                    #####",
            "#####                                                                                                                                                  #####",
            "############################################################################################################################################################",
            "############################################################################################################################################################",
            "############################################################################################################################################################",
    };
    public void imprimirTelaRegras(){
        for (String linha : regras) {
            System.out.println(linha);
        }
        System.out.println();
        System.out.print(">>> Pressione ENTER para continuar...");
        new Scanner(System.in).nextLine();
    }
}