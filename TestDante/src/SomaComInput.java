import java.util.Scanner;

public class SomaComInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando um Scanner pra captar a entrada do usuário
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		
		// Criando uma variável para receber essa entrada e
		// atribuindo o valor que está na variável input
		int num1 = input.nextInt();
		
		System.out.println("Digite mais um número inteiro: ");
		
		// Criando uma segunda variável para receber o número digitado
		int num2 = input.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A Soma é: " + soma);
	}
}
