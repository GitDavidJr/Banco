import java.util.Scanner;
import java.util.Random;

class Banco{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        Random aleatorio = new Random();
        
        String nome[] = new String[5];
        String cpf[] = new String[5];
        int number[] = new int[5];
        Cliente cliente[] = new Cliente[5];
        Poupanca p[] = new Poupanca[5];
        Corrente c[] = new Corrente[5];

        int indice = 0;

        int select;

        Repositorio BD = new Repositorio();

        do{

        System.out.println();
        System.out.println("Selecione uma opção:");
        System.out.println("---------------------------------");
        System.out.println("0. Sair");
        System.out.println("1. Registrar nova conta Poupança");
        System.out.println("2. Registrar nova conta Corrente");
        System.out.println("3. Relatorio");
        System.out.println("4. Excluir conta");
        System.out.println("5. Debitar");
        System.out.println("6. Debitar Credito");
        System.out.println("7. Creditar");
        System.out.println("8. Proximo mês");
        System.out.println();

        System.out.print("Selecione: ");
        select = s.nextInt();

        if(select == 0){
            System.out.println("Encerrando o programa. Obrigado!");
        }

        else if(select == 1){

            System.out.print("Informe o nome do cliente: ");
            nome[indice] = s.nextLine();
            s.nextLine();

            System.out.print("Informe o CPF do cliente: ");
            cpf[indice] = s.nextLine();

            cliente[indice] = new Cliente(nome[indice], cpf[indice]);
            number[indice] = aleatorio.nextInt(8999) + 1001;
            
            p[indice] = new Poupanca(number[indice], 0.0, cliente[indice]);
            BD.inserir(p[indice]);
            
            indice++;

            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("Conta Poupança registrada com sucesso.");
            System.out.println("--------------------------------------");
            System.out.println();
        }

        else if(select == 2){

            System.out.print("Informe o nome do cliente: ");
            nome[indice] = s.nextLine();
            s.nextLine();

            System.out.print("Informe o CPF do cliente: ");
            cpf[indice] = s.nextLine();
            
            cliente[indice] = new Cliente(nome[indice], cpf[indice]);
            number[indice] = aleatorio.nextInt(8999) + 1001;
            
            c[indice] = new Corrente(number[indice], 0.0, cliente[indice]);
            BD.inserir(p[indice]);
            
            indice++;

            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("Conta Corrente registrada com sucesso.");
            System.out.println("--------------------------------------");
            System.out.println();
        }

        else if(select == 3){
            BD.relatorio();
        }
        
        else{
            System.out.println("Opção invalida");
        }

       } while (select != 0); 
    }
}