class Banco{
    public static void main(String[] args){
        
        Cliente david = new Cliente("David","07513397503");
        
        Data vencimento = new Data(12,04);

        Poupanca p1 = new Poupanca("123-4",100.0,david,vencimento,0.01);

        p1.extract();
        
    }
}