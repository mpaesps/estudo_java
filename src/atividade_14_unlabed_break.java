
public class atividade_14_unlabed_break {
    public static void main(String[] args) {
        int[] arrayDeInteiros =
                {32, 87, 3, 589,
                        12, 1076, 2000,
                        8, 622, 127};

        int procurarPor = 12;

        int i;
        boolean encontrei = false;

        for (i = 0; i <arrayDeInteiros.length; i++){
            if (arrayDeInteiros[i] == procurarPor){
                encontrei = true;
                break;
            }
        }
        if (encontrei){
            System.out.println("Encontrei " + procurarPor + " no indice " + i);
        } else {
            System.out.println(procurarPor + "não está no array");
        }
    }
}
