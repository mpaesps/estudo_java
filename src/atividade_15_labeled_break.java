public class atividade_15_labeled_break {
    public static void main(String[] args) {
        int[][] arrayMultidimensional = {
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };

        int procurarPor = 12;

        int i;
        int j = 0;

        boolean encontrei = false;

        procuro:
            for (i = 0; i < arrayMultidimensional.length; i++){
                for (j = 0; j< arrayMultidimensional[i].length; j++){
                    if (arrayMultidimensional[i][j] == procurarPor){
                        encontrei = true;
                        break procuro;
                    }
                }
            }
            if (encontrei){
                System.out.println("numero " + procurarPor + " em [" + i + "] , [" + j+"]");
        }
    }
}
