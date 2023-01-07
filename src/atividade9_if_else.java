public class atividade9_if_else {
    public static void main(String[] args){

        int nota = 76;
        char nota2;

        if (nota >= 100) {
            nota2 = 'A';
        }else if ( nota>= 80){
            nota2 = 'B';
        }else if ( nota>= 70){
            nota2 = 'C';
        }else if ( nota>= 60){
            nota2 = 'D';
        }else {
            nota2 = 'F';
        }
        System.out.println("nota: " + nota2 );
    }
}
