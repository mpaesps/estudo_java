public class atividade7_testando_operadores {
    public static void main(String[] args) {

        //operadores unários

        int i = 3;
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        System.out.println(++i);

        System.out.println(i++);

        System.out.println(i);


//operador ternario

        int valor1 = 1;
        int valor2 = 2;
        int result;
        boolean condicao = true;

        result = condicao ? valor1 : valor2;

        System.out.println(result);


    }
}