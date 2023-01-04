public class atividade5_copiando_arrays {

    public static void main(String[] args) {
        String[] copiarDe = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copiarPara = new String[7];

        System.arraycopy(copiarDe,0,copiarPara,0,7);
        for(String cafe : copiarPara) {
            System.out.print(cafe + " ");
        }
    }
}
