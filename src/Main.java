import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         menu();
        System.out.println("Urna eletronica");
        Scanner scanner = new Scanner(System.in);
        Candidato candidato = new Candidato();

        ArrayList<Candidato> candidatos = new ArrayList<>();

        System.out.println("Informe o numero do candidato:");
        candidato.setNumeroCandidato(scanner.nextInt());
        System.out.println("Informe o nome do candidato:");
        candidato.setNome(scanner.next());
        System.out.println("Informe o partido:");
        candidato.setPartido(scanner.next());
        System.out.println("Insira o caminho da foto:");
        candidato.setFoto(scanner.next());


        candidatos.add(candidato);
        System.out.println(candidato.toString());
    }
    
    public static void menu(){
        int opcao;
        Scanner ads = new Scanner(System.in);

        do{
            try{
                System.out.println("Escolha uma das opções abaixo: ");
                System.out.println("1 - Cadastro do candidato: ");
                System.out.println("2 - Cadastro de eleitores: ");
                System.out.println("3 - Votação: ");
                System.out.println("4 - Apuração: ");
                System.out.println("5 - Exibição dos Resultados: ");
                System.out.println("6 - Sair: ");

                opcao = ads.nextInt();
            }catch (Exception e){
                System.out.println("Digite novamente");
                opcao = 0;
            }

        }while (opcao <= 6 && opcao >= 1 );

    }
    
     public static void CadastraEleitor(Object eleitor) {
        System.out.println("Informe o código: ");
        String codigo = scanner.nextLine();

        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
    }

    public static void ListaEleitores(ArrayList<Object> eleitores) {
        for (Object eleitor : eleitores) {
            System.out.println("Código: " + eleitor.GetCodigo());
            System.out.println("Nome: " + eleitor.GetNome());git
        }
    }
}
