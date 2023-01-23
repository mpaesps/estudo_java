package entidades;

public class CurrencyConverter {

    public double dollarPrice;
    public double dollarBought;

    public double amount(){
       double dolar = dollarPrice * dollarBought;
       return ((dolar * 6) / 100) + dolar;
    }
}
