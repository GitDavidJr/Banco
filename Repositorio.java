public class Repositorio {

    private Conta contas[];
    private int indice;

    public Repositorio() {
        contas = new Conta[5];
        indice = 0;
    }
    
    public void inserir(Conta c){
        contas[indice] = c;
        indice++;
    }

    public void excluir(Conta c){
        for(int i = 0; i < indice; i++){
            if(c == contas[i]){
                contas[i] = contas[indice - 1];
                contas[indice - 1] = null; 
            }
        }
    }

    public void relatorio(){
        for(int i = 0; i < indice; i++){
            contas[i].extract();
            System.out.println();
        }
    }
}
