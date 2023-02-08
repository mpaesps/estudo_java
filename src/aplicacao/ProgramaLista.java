package aplicacao;

import entidades.ListEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ListEmployee> list = new ArrayList<>();
        
        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list,id)){
                System.out.println("Este ID já está registrado. \nOperação Encerrada.");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();
            
            list.add(new ListEmployee(id, name, salary));
        }

        System.out.println();
        System.out.println("Entre com o id do funcionário que terá ");
        int id = sc.nextInt();
        ListEmployee emp = list.stream().filter(x ->x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("Este id não existe!");
        }else {
            System.out.print("Entre com a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increasySalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (ListEmployee obj : list){
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<ListEmployee> list, int id) {
        ListEmployee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp!=null;
    }
}
