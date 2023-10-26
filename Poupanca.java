class Poupanca extends Conta{

    private Data atualizacao;
    private Double juros;
    private int tempo;

    public Poupanca(String number, Double balance, Cliente holder, Data atualizacao){
        super(number, balance, holder);
        this.atualizacao = atualizacao;
        juros = 0.0;
        tempo = 0;
    }

    public void setJuros(Double j){
        juros = j;
    }

    public void renderJuros(Data start){
        atualizacao.difData(start, tempo);
        balance = balance * Math.pow((1 + juros),tempo);
        tempo = 0;
    }

    public void extract(){
        super.extract();
        System.out.println("Tipo da conta: Poupança");
        System.out.print("Ultima atualização: ");
        atualizacao.printData();
        System.out.println("Rentabilidade: " + juros + "/mes");
    }
}