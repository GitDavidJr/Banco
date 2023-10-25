class Poupanca extends Conta{

    private Data birth;
    private Double juros;

    public Poupanca(String number, Double balance, Cliente holder, Data birth, Double juros){
        super(number, balance, holder);
        this.birth = birth;
        this.juros = juros;
    }

    public void renderJuros(int X){
        balance = balance * Math.pow((1 + juros),X);
    }

    public void imprimir(){
        super.extract();
        birth.printData();
        System.out.println("Juros: " + juros);
    }
}