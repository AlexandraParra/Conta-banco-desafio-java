import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Qual tipo de conta deseja abrir [Poupança, Corrente]: ");
        String tipoConta = sc.nextLine();

        //Exibir a mensagem conta criada
        System.out.println("Sua conta foi criada com sucesso!");
        System.out.println("Nome do titular: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo de conta: " + tipoConta);
        Random random = new Random();
        int numeroConta = random.nextInt((9999999 - 1000000) + 1) + 1000000;
        System.out.println("Número de conta: " + numeroConta);

        //Fechando a scanner
        sc.close();
    }
}