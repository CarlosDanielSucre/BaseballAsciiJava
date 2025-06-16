public class TablaOuts {
    public void tabla(String[][] campo) {
        for (int i = 10; i <= 14; i++) {
            campo[i][115] = "|"; // 103 - 4
            campo[i][135] = "|"; // 103 - 4

        }

        for (int  j = 116;j<135;j++){
            for(int i = 10; i <=14; i++){
                if(i % 2 == 0){
                    campo[i][j] = " ";
                    campo[i][j] = " ";
                }else{
                    campo[i][j] = "-";
                    campo[i][j] = "-";
                }


            }
        }
        for (int  j = 116;j<135;j++){
            for(int i = 10; i <=14; i++){
                if(i == 10){
                    j +=4;
                    campo[i][j] = "|";
                    campo[i][j] = "|";
                    j -=4;
                }else if(i == 14){
                    j+=4;
                    campo[i][j] = "|";
                    campo[i][j] = "|";
                }


            }
        }

        //Palavra Outs

        campo[12][120] = "O";
        campo[12][123] = "U";
        campo[12][126] = "T";
        campo [12][129] = "S";

        // Desenho de Outs
        campo[10][117] = "0";
        campo[10][122] = "1";
        campo[10][128] = "2";
        campo[10][133] = "3";
    }
}
