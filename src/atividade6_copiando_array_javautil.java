public class atividade6_copiando_array_javautil {

    public static void main(String[] args){
        String[] copiarDe = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copiarPara = java.util.Arrays.copyOfRange(copiarDe, 4,13);
        for(String cafe: copiarPara){
            System.out.print(cafe + " ");
        }
    }
}
