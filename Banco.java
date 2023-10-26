import java.util.Scanner;

class Banco{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        
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
        
    }
}