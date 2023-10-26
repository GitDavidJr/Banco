class Banco{
    public static void main(String[] args){
        
        Cliente david = new Cliente("David","07513397503");
        
        Data dataP1 = new Data(12,04);
        
        Poupanca p1 = new Poupanca("123-4",100.0,david,dataP1);

        Repositorio BD = new Repositorio();

        BD.inserir(p1);
        BD.inserir(p1);
        BD.inserir(p1);
        BD.inserir(p1);
        BD.inserir(p1);

        BD.relatorio();

        //criar class Tempo, com metodo nextMes onde passara 1 mes fazendo as alterações devidas em cada conta e relogio
        
    }
}