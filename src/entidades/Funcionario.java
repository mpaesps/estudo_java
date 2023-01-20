package entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double impostos;


    public double salarioLiquido() {
        return salarioBruto - impostos;
    }

    public void aumentarSalario(double porcentagem){
       salarioBruto += salarioBruto * porcentagem / 100;

    }

    public String toString() {
        return
                        nome
                        + ", R$"
                        + String.format("%.2f", salarioLiquido());
    }



}
