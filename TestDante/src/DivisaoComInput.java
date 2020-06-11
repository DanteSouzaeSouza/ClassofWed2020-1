import java.util.Scanner;

public class DivisaoComInput {

	public static void main(String[] args) {
		
		// Criando um Scanner pra captar a entrada do usuário
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		
		// Criando uma variável para receber essa entrada e
		// atribuindo o valor que está na variável input
		int num1 = input.nextInt();
		
		System.out.println("Digite mais um número inteiro: ");
		
		// Criando uma segunda variável para receber o número digitado
		int num2 = input.nextInt();		
		
		// checando se o segundo número digitado é igual a zero:
		if (num2 == 0) {
			// se for igual a zero, pede para o usuário digitar outro número
			System.out.println("Não existe divisão por zero! Digite outro número: ");
			
			// capta o número digitado
			num2 = input.nextInt();
		}		
		int div = num1 / num2;
		
		System.out.println("A Divisão é: " + div);
	}	
}
