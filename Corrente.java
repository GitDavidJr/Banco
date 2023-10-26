public class Corrente extends Conta {

    private Data vencimento;
    private Double value;
    private int tempo;
    //criar parametro limite
    //valor parametro valor mensal usado

    public Corrente(String number, Double balance, Cliente holder, Data vencimento){
        super(number, balance, holder);
        this.vencimento = vencimento;
        value = 0.0;
        tempo = 0;
        //limite inicial 500
        //valor mensal usado inicial 0
    }

    public void setTaxa(Double V){
        value = V;
    }

    //Criar metodo set limite

    //criar metodo de debitar se o valor do debitor for menor igual limite menos valor usado mensal
    //se tiver com o balance negativo não sera possivel debitar

    public void cobranca(Data start){ 
        vencimento.difData(start, tempo);
        balance -= value * tempo;
        tempo = 0;
        //criar um "if" se for usado 80 reais no mes não cobrar a taxa mensal
        //debitar o valor mensal usado do saldo(balance)
        //estando com o saldo negativo fazer cobrança da taxa e jutos de 10% ao mes do valor negativo
    }

    public void extract(){
        super.extract();
        System.out.println("Tipo da conta: Corrente");
        System.out.print("Ultima cobrança: ");
        vencimento.printData();
        System.out.println("Taxa: " + value + "/mes");
    }
}