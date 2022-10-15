public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        Dinheiro dinheiro = new Dinheiro();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume Atual? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Atualização > TV Ligada? " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        System.out.println("Atualização > Volume Atual? " + smartTv.volume);
        
        smartTv.trocarCanal();
        System.out.println("Atualização > Canal Atual? " + smartTv.canal);

        
        dinheiro.valor = 850.00;

        System.out.println("Você pagou " + dinheiro.valor + " reais na TV");

        dinheiro.retidara();

        System.out.println("Você fico com: " + dinheiro.novoSaldo);
    }
}
