package entidades;

public class ContaBancaria {
    private int numeroConta;
    private String titularConta;
    private double contaSaldo;

    public ContaBancaria(int numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }
    public ContaBancaria(int numeroConta, String titularConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public  void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getContaSaldo() {
        return contaSaldo;
    }

    public void depositar(double montante){
        contaSaldo += montante;
    }
    public void sacar(double montante){
        contaSaldo -= montante + 5;
    }

    @Override
    public String toString() {
        return "ContaBancaria \n" +
                "numeroConta = " + numeroConta +
                ", titularConta = " + titularConta + '\'' +
                ", contaSaldo = $" + contaSaldo ;
    }
}

