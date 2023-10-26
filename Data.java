public class Data {

    private int mes;
    private int ano;
    
    public Data(int mes, int ano){
        this.mes = mes;
        this.ano = ano;
    }

    public void printData(){
        System.out.println(mes + "/" + ano);
    }

    public void difData(Data data2, int intervaloT){
        int difMes = Math.abs(this.mes - data2.mes);
        int difAno = Math.abs(this.ano - data2.ano);
        intervaloT = difMes + (difAno * 12);
    }
}
