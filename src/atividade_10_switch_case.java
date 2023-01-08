public class atividade_10_switch_case {
    public static void main(String[] args){
    int mes_ano = 8;
    String mesStr;

        switch (mes_ano){

            case 1: mesStr = "Janeiro";
                break;
            case 2: mesStr = "Fevereiro";
                break;
            case 3: mesStr = "Março";
                break;
            case 4: mesStr = "Abril";
                break;
            case 5: mesStr = "Maio";
                break;
            case 6: mesStr = "Junho";
                break;
            case 7: mesStr = "Julho";
                break;
            case 8: mesStr = "Agosto";
                break;
            case 9: mesStr = "Setembro";
                break;
            case 10: mesStr = "Outubro";
                break;
            case 11: mesStr = "Novembro";
                break;
            case 12: mesStr = "Dezembro";
                break;
            default: mesStr = "mes invalido";
                break;
        }
        System.out.println(mesStr);
    }
}
