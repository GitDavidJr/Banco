class Poupanca extends Conta{

    private Double juros;

    public Poupanca(int number, Double balance, Cliente holder){
        super(number, balance, holder);
        juros = 0.0;
    }

    public void setJuros(Double j){
        juros = j;
    }

    public void viradaM(){
        balance += balance * juros;
    }

    public void extract(){
        super.extract();
        System.out.println("Tipo da conta: Poupança");
        System.out.println("Rentabilidade: " + juros + "/mes");
    }
}