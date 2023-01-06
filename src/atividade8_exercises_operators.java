public class atividade8_exercises_operators {
    public static void main(String[] args){

        /*Change the following program to use compound assignments:
          int result = 1 + 2; // result is now 3
          System.out.println(result);

          result = result - 1; // result is now 2
          System.out.println(result);

          result = result * 2; // result is now 4
          System.out.println(result);

          result = result / 2; // result is now 2
          System.out.println(result);

          result = result + 8; // result is now 10
          result = result % 7; // result is now 3
          System.out.println(result);
        */
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result = --result; // result is now 2
        System.out.println(result);

        result = result * 2; // result is now 4
        System.out.println(result);

        result = result / 2; // result is now 2
        System.out.println(result);

        result = result + 8; // result is now 10
        System.out.println(result);

        result = result % 7; // result is now 3
        System.out.println(result);


  //  In the following program, explain why the value "6" is printed twice in a row:

        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"

        //em ++i o programa incrementa e já mostra o valor e em i++ o programa incrementa o valor depois de chamar a variavel
    }
}
