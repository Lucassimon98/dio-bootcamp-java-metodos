public class Dinheiro {

    double saldo = 1000.00;
    double valor;
    double novoSaldo;

    public double retidara(){
        novoSaldo = saldo - valor;
        return novoSaldo;
    }
    
}