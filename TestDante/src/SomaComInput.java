import java.util.Scanner;

public class SomaComInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando um Scanner pra captar a entrada do usu�rio
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		
		// Criando uma vari�vel para receber essa entrada e
		// atribuindo o valor que est� na vari�vel input
		int num1 = input.nextInt();
		
		System.out.println("Digite mais um n�mero inteiro: ");
		
		// Criando uma segunda vari�vel para receber o n�mero digitado
		int num2 = input.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A Soma �: " + soma);
	}
}
