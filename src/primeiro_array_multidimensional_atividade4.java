public class primeiro_array_multidimensional_atividade4 {

    public static void main(String[] args) {
        String[][] nomes = {{"Sr. ", "Sra. ", "Srta. "},
                {"Carvalho", "Paes", "Gomes"}
        };

        //Srta. Paes
        System.out.println(nomes[0][2] + nomes[1][1]);

        //Sr. Gomes
        System.out.println((nomes[0][0] + nomes[1][2]));

        //Sra. Carvalho
        System.out.println((nomes[0][1] + nomes[1][0]));

    }
}
