import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class atividade_42_lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //inserindo elementos
        list.add("Maria");
        list.add("Alex");
        list.add("Ana");
        list.add("Roberto");


        //inserindo elementos em local especifico
        list.add(2, "Maxwell");

        //descobrir posicao do elemento
        System.out.println("Posicao de Maxwell " + list.indexOf("Maxwell"));
        //buscando elemento que não existe na lista
        System.out.println("Posicao de Maxwell " + list.indexOf("joao"));

        //tamanho da lista
        System.out.println(list.size());

        //removendo elemento da lista
        //list.remove("Ana");
        //list.remove(1);

//        for (String x : list) {
//            System.out.println(x);
//        }
//        System.out.println("-----------------------------");
//        //removendo elemento da lista que adente predicado(função lambda)
//        list.removeIf(x -> x.charAt(0) == 'M');
//        for (String x : list) {
//            System.out.println(x);
//        }
//        System.out.println("-----------------------------");
////        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//        for (String x : result) {
//            System.out.println(x);
        System.out.println("-----------------------------");
        //encontrar primeiro elemento q atenda predicado
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }}
//
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Maria");
//        list.add("Alex");
//        list.add("Bob");
//        list.add("Anna");
//        list.add(2, "Marco");
//        System.out.println(list.size());
//        for (String x : list) {
//            System.out.println(x);
//        }
//        System.out.println("---------------------");
//        list.removeIf(x -> x.charAt(0) == 'M');
//        for (String x : list) {
//            System.out.println(x);
//        }
//        System.out.println("---------------------");
//        System.out.println("Index of Bob: " + list.indexOf("Bob"));
//        System.out.println("Index of Marco: " + list.indexOf("Marco"));
//        System.out.println("---------------------");
//        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//        for (String x : result) {
//            System.out.println(x);
//        }
//        System.out.println("---------------------");
//        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
//        System.out.println(name);
//    }
//}