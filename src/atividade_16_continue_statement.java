public class atividade_16_continue_statement {
    public static void main(String[] args) {
        String meAche =  "peter piper picked a " + "peck of pickled peppers";
        int max = meAche.length();
        int numPs = 0;
        int i = 0;

        for(i=0; i < max; i++){
            if (meAche.charAt(i) != 'p')
                continue;

                numPs++;

        }
        System.out.println("encontrei " + numPs + " ps");
    }
}
